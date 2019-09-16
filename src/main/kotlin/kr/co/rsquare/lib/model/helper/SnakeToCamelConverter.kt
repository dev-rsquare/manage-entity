package kr.co.rsquare.lib.model.helper

import com.google.common.base.CaseFormat
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class SnakeToCamelConverter : AttributeConverter<String, String> {

    override fun convertToDatabaseColumn(attribute: String?): String? = attribute


    override fun convertToEntityAttribute(dbData: String?): String? =
        dbData?.let { CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, it) }

}

package kr.co.rsquare.lib.model.helper

import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class BooleanToYnConverter : AttributeConverter<Boolean, String> {
    override fun convertToDatabaseColumn(attribute: Boolean?): String {
        return when(attribute != null && attribute){
            true -> "Y"
            false -> "N"
        }
    }

    override fun convertToEntityAttribute(dbData: String?): Boolean {
        return "Y" == dbData
    }

}




package com.example.fitnesskit_test.util

import java.lang.RuntimeException
import java.text.SimpleDateFormat
import java.util.*

private const val real_format = "YYYY-MM-dd"
private const val format_display = "EEEE, dd MMMM"

//время над cardView
fun getDateFormat(date:String?):String{
    val utcFormat = SimpleDateFormat(real_format, Locale.ROOT)
    val displayFormat = SimpleDateFormat(format_display, Locale.getDefault())
    var dateFormat: Date? = null
    try {
        if (date != null) {
            dateFormat = utcFormat.parse(date)
        } else {
            dateFormat.toString()
        }
        return displayFormat.format(dateFormat!!)
    } catch (e:Exception){
        throw RuntimeException(e)
    }
}
//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.time.format.DateTimeFormatter
import java.math.RoundingMode
import java.text.DecimalFormat

private val timestampFormatter : DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss.SSS")

fun WeatherSensorReadingType.toString() : String
{
    val temp = this.temperature.toStringTwoDecimalPlaces
    val humidity = this.humidity.toStringTwoDecimalPlaces
    val time = this.time.format(timestampFormatter)
    return "$time $temp°, $humidity%, $pressure kPa" //will need to add localization
}


val Double.toStringTwoDecimalPlaces: String 
    get() = String.format("%.2f", this)

val Double.toStringFourDecimalPlaces: String 
    get() = String.format("%.4f", this) 
    

//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.DecimalFormat

public abstract class WeatherSensorReadingType() {
    /// Temperature in degrees Celcius
    abstract var temperature: Double

    /// Percent humidity
    abstract var humidity: Double

    /// Barometric pressure in kiloPascals
    abstract var pressure: Double

    /// Reading timestamp
    abstract var time: LocalDateTime

    private val timestampFormatter : DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss.SSS")

    //override toString
    override fun toString() : String
    {
        val temp = this.temperature.toStringTwoDecimalPlaces
        val humidity = this.humidity.toStringTwoDecimalPlaces
        val time = this.time.format(timestampFormatter)
        return "$time $temp°, $humidity%, $pressure kPa" //will need to add localization
    }
}

//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class WeatherSensorReading( 
    override var temperature: Double,
    override var humidity: Double,
    override var pressure: Double,
    override var time: LocalDateTime
): WeatherSensorReadingType {
        
        private val timestampFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss.SSS")

        // override toString
        override fun toString(): String
        {
            val temp = this.temperature.toStringTwoDecimalPlaces
            val humidity = this.humidity.toStringTwoDecimalPlaces
            val time = this.time.format(timestampFormatter)
            return "$time: $temp°, $humidity%, ${pressure}kPa" //will need to add localization
        }
    }

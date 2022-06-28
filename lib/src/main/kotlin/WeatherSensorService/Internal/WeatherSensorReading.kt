//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.time.LocalDateTime

data class WeatherSensorReading( 
    override var temperature: Double,
    override var humidity: Double,
    override var pressure: Double,
    override var time: LocalDateTime) : WeatherSensorReadingType

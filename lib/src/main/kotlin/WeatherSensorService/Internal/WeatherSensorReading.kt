//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.util.* 

abstract class WeatherSensorReading(): WeatherSensorReadingType {
    abstract override var temperature: Double
    abstract override var humidity: Double
    abstract override var pressure: Double
    abstract override var time: Date
}

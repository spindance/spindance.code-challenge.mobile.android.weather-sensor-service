//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

data class WeatherSensorReading: WeatherSensorReadingType {
    var temperature: Double
    var humidity: Double
    var pressure: Double
    var time: Date
}

//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

public interface WeatherSensorReadingType: CustomStringConvertible {
    /// Temperature in degrees Celcius
    var temperature: Double

    /// Percent humidity
    var humidity: Double

    /// Barometric pressure in kiloPascals
    var pressure: Double

    /// Reading timestamp
    var time: Date
}

//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

data class WeatherSensorService {
    companion object {
        public var shared = WeatherSensorService()
    }
    public var reader: WeatherSensorReaderType = MockWeatherSensorReader()
    private init() {}
}

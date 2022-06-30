//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

public class WeatherSensorService {
    companion object {
        public val shared = WeatherSensorService()
    }
    public val reader: WeatherSensorReaderType = MockWeatherSensorReader()
}

//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

package WeatherSensorService
import WeatherSensorService
import WeatherSensorReaderType
import kotlin.test.Test

final class WeatherSensorServiceTests {
    /// Simply verify the singleton supports a ``WeatherSensorReaderType``
    @Test fun testWeatherSensorService() {
        WeatherSensorService.shared.reader as WeatherSensorReaderType
    }
}
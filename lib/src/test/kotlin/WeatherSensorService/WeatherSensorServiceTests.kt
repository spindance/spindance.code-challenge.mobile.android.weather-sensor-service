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
import kotlin.test.assertTrue

final class WeatherSensorServiceTests {
    /** Simply verify the singleton supports a WeatherSensorReaderType */
    @Test fun testWeatherSensorService() {
       assertTrue(WeatherSensorService.reader is WeatherSensorReaderType)
    }
}
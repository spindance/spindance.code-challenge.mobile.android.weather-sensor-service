//
// SpinDance
// Weather Sensor Service
//  
// Copyright © 2022 SpinDance. All rights reserved.
//

package WeatherSensorService

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import WeatherSensorReaderType
import MockWeatherSensorReader
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.*

class MockWeatherSensorReaderTests {
    @Test fun test_weatherSensorServiceBehavior() {
        var sut: WeatherSensorReaderType = MockWeatherSensorReader()
        sut.set(readingInterval = 1U)
        var newInterval = sut.readingInterval + 1U
        assertEquals(newInterval, 2U)
        sut.set(readingInterval = newInterval)
        assertEquals(newInterval, sut.readingInterval)
        sut.sensorReaderFlow
        sut.startSensorReadings()
        sut.stopSensorReadings()
    }

    @Test fun test_readingIntervalMustBeGreaterThanZero() {
        var sut = MockWeatherSensorReader()
        var currentInterval = sut.readingInterval
        assertTrue(currentInterval > 0U)
        sut.set(readingInterval = 0U)
        assertEquals(currentInterval, sut.readingInterval)
    }

    @Test fun test_setReadingIntervalMinAndMax() {
        var sut = MockWeatherSensorReader()
        sut.set(readingInterval = UInt.MAX_VALUE)
        assertEquals(UInt.MAX_VALUE, sut.readingInterval)
        sut.set(readingInterval = 1U)
        assertEquals(1U, sut.readingInterval)
    }
}
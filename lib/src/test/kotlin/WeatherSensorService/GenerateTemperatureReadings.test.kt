//
// SpinDance
// Weather Sensor Service
//  
// Copyright © 2022 SpinDance. All rights reserved.
//

package WeatherSensorService

import kotlin.test.Test

import GenerateTemperatureReadings
import kotlin.test.assertEquals
import toStringFourDecimalPlaces
import toStringTwoDecimalPlaces

class GenerateTemperatureReadingsTests {
    @Test fun testRandomGeneration(){
        assertEquals("3.1395",GenerateTemperatureReadings((1/100.0),-50.0..50.0).toStringFourDecimalPlaces)
        assertEquals("50.0000",GenerateTemperatureReadings((25/100.0),-50.0..50.0).toStringFourDecimalPlaces)
        assertEquals("0.0000",GenerateTemperatureReadings((50/100.0), -50.0..50.0).toStringFourDecimalPlaces)
        assertEquals("-50.0000",GenerateTemperatureReadings((75/100.0), -50.0..50.0).toStringFourDecimalPlaces)
        assertEquals("-0.0000",GenerateTemperatureReadings((100/100.0), -50.0..50.0).toStringFourDecimalPlaces)
    }
}
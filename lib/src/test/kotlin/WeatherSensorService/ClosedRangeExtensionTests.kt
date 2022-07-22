//
// SpinDance
// Weather Sensor Service
//  
// Copyright © 2022 SpinDance. All rights reserved.
//

package WeatherSensorService

import kotlin.test.Test

import calculateSineWaveReading
import kotlin.test.assertEquals
import toStringFourDecimalPlaces
import toStringTwoDecimalPlaces

class ClosedRangeExtensionTests {
    @Test fun testReadingsGeneration() {
        var range: ClosedRange<Double> = -50.0..50.0
        assertEquals("3.1395",range.calculateSineWaveReading(1/100.0).toStringFourDecimalPlaces)
        assertEquals("50.0000",range.calculateSineWaveReading(25/100.0).toStringFourDecimalPlaces)
        assertEquals("0.0000",range.calculateSineWaveReading(50/100.0).toStringFourDecimalPlaces)
        assertEquals("-50.0000",range.calculateSineWaveReading(75/100.0).toStringFourDecimalPlaces)
        assertEquals("-0.0000",range.calculateSineWaveReading(100/100.0).toStringFourDecimalPlaces)
    }
}
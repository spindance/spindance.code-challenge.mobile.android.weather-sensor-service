//
// SpinDance
// Weather Sensor Service
//  
// Copyright © 2022 SpinDance. All rights reserved.
//

package WeatherSensorService

import kotlin.test.Test
import kotlin.test.assertEquals
import toStringFourDecimalPlaces
import toStringTwoDecimalPlaces

class DoubleExtensionsTests {

    @Test fun test_roundToTwoDecimals() {
        assertEquals("10.23", 10.23453.toStringTwoDecimalPlaces)
    }

    @Test fun test_roundToFourDecimals() {
        assertEquals("10.2345", 10.23453.toStringFourDecimalPlaces)
    }
} 
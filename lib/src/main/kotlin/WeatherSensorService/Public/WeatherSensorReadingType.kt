//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

import java.time.LocalDateTime

public interface WeatherSensorReadingType {
    /** Temperature in degrees Celcius */
    val temperature: Double

    /** Percent humidity */
    val humidity: Double

    /** Barometric pressure in kiloPascals */
    val pressure: Double

    /** Reading timestamp */
    val time: LocalDateTime
}

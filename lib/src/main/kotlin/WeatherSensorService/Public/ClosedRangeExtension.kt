 //
 // SpinDance
 // Weather Sensor Service
 //
 // Copyright © 2022 SpinDance. All rights reserved.
 //

 import kotlin.random.Random
 import kotlin.math.sin
 import kotlin.math.abs
 
 public fun ClosedRange<Double>.calculateSineWaveReading(cyclePercentage: Double): Double {
    // Will be between -1 and 1 with the value determined based on the completion value of cyclePercentage
    val coefficient = sin(2 * Math.PI * cyclePercentage)
 
    // median of the amplitude
    val median = abs(endInclusive - start) / 2
 
    // Applies the coefficient and median amplitude to create a sin wave based around the range provided
    return start + median + (coefficient * median)
}
 
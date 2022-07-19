import kotlin.random.Random

public fun GenerateTemperatureReadings(cyclePercentage: Double, range: ClosedRange<Double>) : Double {
    //between -1 and 1 
    val coefficient = Math.sin(2 * Math.PI * cyclePercentage)

    //median of the amplitude
    val median = Math.abs(range.endInclusive - range.start) / 2

    // Temperature applies the coefficient to create a sin wave based around the median, offset by
    // the min amplitude
    return range.start + (median + (coefficient * median))
}
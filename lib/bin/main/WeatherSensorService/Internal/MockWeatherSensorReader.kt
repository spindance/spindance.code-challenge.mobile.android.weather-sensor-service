 //
 // SpinDance
 // Weather Sensor Service
 //
 // Copyright © 2022 SpinDance. All rights reserved.
 //
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import java.util.Timer
import kotlin.concurrent.*
import kotlin.random.Random
import java.time.LocalDateTime

private class Constants {
    companion object {
        var READER_INTERVAL: UInt = 1U
        val TEMPERATURE_RANGE : ClosedRange<Double> = -40.0..40.0
        val HUMIDITY_RANGE : ClosedRange<Double> = 0.0..100.0
        val PRESSURE_RANGE : ClosedRange<Double> = 95.0..105.0
    }
}

class MockWeatherSensorReader: WeatherSensorReaderType {
     
    private var timer: Timer? = null

    override var readerInterval : UInt = Constants.READER_INTERVAL
        set(value) {
            if ( readerInterval != value){
                if (timer != null){
                    startSensorReadings()
                }
            }
        }

    override var sensorReadingsPublisher : Channel<WeatherSensorReading> = Channel<WeatherSensorReading>()

    override fun set(readingInterval: UInt) {
        if (readingInterval >= 1U && readingInterval <= UInt.MAX_VALUE) { 
            readerInterval = readingInterval 
        }
    }

    override fun startSensorReadings() {
         stopSensorReadings()

         // Report the first reading immediately, then start the timer
         reportSensorReadings()

         timer = fixedRateTimer("default", false, 0L, readerInterval){
            reportSensorReadings()
         }
     }

    override fun stopSensorReadings() {
        timer?.cancel()
        timer = null
     }

     private suspend fun reportSensorReadings() {
         sensorReadingsPublisher.send(
             WeatherSensorReading(
                Random.nextDouble(-40.0, 40.0),
                Random.nextDouble(0.0,100.0),
                Random.nextDouble(95.0,105.0),
                LocalDateTime.now()
             )
         )
     }
 }

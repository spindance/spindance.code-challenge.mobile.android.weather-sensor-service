//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.util.concurrent.Flow.Publisher as Publisher;

public interface WeatherSensorReaderType {
     /// The time interval in seconds at which weather sensor readings are published
     var readerInterval: UInt

     /// Publishes ``WeatherSensorReadingType`` every ``readerInterval`` seconds
     var sensorReadingsPublisher: Publisher<WeatherSensorReadingType>
 
     /// Sets readerInterval; must be greater than 0
     fun set(readingInterval: UInt)
 
     /// Starts the indefinite generation of weather sensor readings
     fun startSensorReadings()
 
     /// Stop the generation of weather sensor readings
     fun stopSensorReadings()

}
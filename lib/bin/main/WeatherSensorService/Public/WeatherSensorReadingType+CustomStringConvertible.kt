//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//
import java.time.format.DateTimeFormatter;

private val timestampFormatter : DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss.SSS").withZone(TimeZone.current)

val WeatherSensorReadingType.description: WeatherSensorReadingType 
    get() {
        var temp = temperature.toStringTwoDecimalPlaces
        var humidity = humidity.toStringTwoDecimalPlaces
        var time = time.format(timestampFormatter)
        return "\(time): \(temp)°, \(humidity)%, \(pressure)kPa" //will need to add localization
    }


val Double.toStringTwoDecimalPlaces: String 
    get(){
        return String(format: "%.2f", this) 
    }

val Double.toStringFourDecimalPlaces: String 
    get(){
        return String(format: "%.4f", this) 
    }

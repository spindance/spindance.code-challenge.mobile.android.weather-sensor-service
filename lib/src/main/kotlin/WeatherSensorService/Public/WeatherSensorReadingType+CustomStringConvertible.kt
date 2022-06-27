//
// SpinDance
// Weather Sensor Service
//
// Copyright © 2022 SpinDance. All rights reserved.
//

val WeatherSensorReadingType.description: WeatherSensorReadingType {
    get() {
        var temp = temperature.toStringTwoDecimalPlaces
        var humidity = humidity.toStringTwoDecimalPlaces
        var time = DateFormatter.timestampFormatter.string(from: time)
        return NSLocalizedString("\(time): \(temp)°, \(humidity)%, \(pressure)kPa", comment: "")
    }
}

val DateFormatter {
    get(){
        var timestampFormatter: DateFormatter = {
            var formatter = DateFormatter()
            formatter.dateFormat = "yyyy-dd-MM HH:mm:ss.SSS"
            formatter.timeZone = TimeZone.current
            return formatter
        }
    }
}

var Double {
    get(){
        var toStringTwoDecimalPlaces: String { String(format: "%.2f", this) }
        var toStringFourDecimalPlaces: String { String(format: "%.4f", this) }
    }
}

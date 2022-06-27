//  //
//  // SpinDance
//  // Weather Sensor Service
//  //
//  // Copyright © 2022 SpinDance. All rights reserved.
//  //

//  private enum class Constants {
//      companion object {
//          var readerInterval: UInt = 1,
//          var temperatureRange = -40.0...40.0,
//          var humidityRange = 0.0...100.0,
//          var pressureRange = 95.0...105.0;
//      }
//  }

//  class MockWeatherSensorReader: WeatherSensorReaderType {
//      private var timer: Timer?

//      private var readerInterval = Constants.readerInterval {
//          didSet {
//              guard oldValue != readerInterval else { return }

//              // If we were reporting, restart.
//              if timer != nil {
//                  startSensorReadings()
//              }
//          }
//      }

//      private var sensorReadingsSubject = PassthroughSubject<WeatherSensorReadingType, Never>()

//      var sensorReadingsPublisher: AnyPublisher<WeatherSensorReadingType, Never> {
//          sensorReadingsSubject.eraseToAnyPublisher()
//      }

//      fun set(readingInterval: UInt) {
//          guard 1...UInt.max ~= readingInterval else { return }
//          readerInterval = readingInterval
//      }

//      fun startSensorReadings() {
//          stopSensorReadings()

//          // Report the first reading immediately, then start the timer
//          reportSensorReadings()

//          timer = Timer.scheduledTimer(
//              withTimeInterval: TimeInterval(readerInterval),
//              repeats: true
//          ) { [weak self] _ in
//              guard let self = self else { return }
//              self.reportSensorReadings()
//          }
//      }

//      fun stopSensorReadings() {
//          timer?.invalidate()
//          timer = nil
//      }

//      private fun reportSensorReadings() {
//          sensorReadingsSubject.send(
//              WeatherSensorReading(
//                  temperature: Double.random(in: Constants.temperatureRange),
//                  humidity: Double.random(in: Constants.humidityRange),
//                  pressure: Double.random(in: Constants.pressureRange),
//                  time: Date()
//              )
//          )
//      }
//  }

# spindance.code-challenge.mobile.android.weather-sensor-service-package
Kotlin Package implementing a singleton service that provides access to a weather sensor reader.

## How to Add the library to another project
1. Copy the `lib.jar` file in `lib/build/libs` into the `app\libs` directory of your new project
2. Add the line `implementation files('libs/lib.jar')` to the `build.gradle` file in the `app` directory

For instructions on how to add in Android Studio: [Click Here](https://www.tutorialkart.com/kotlin-android/add-external-jar-to-library-in-android-studio/)
# Vanilla Java Gradle Command Line Project

This repository shows a basic setup for a command line application in Java build with Gradle.


## Getting Started

Java 1.8 is expected to be installed on our system.
Having Gradle installed is optional as it is also included in this repository with the [Gradle wrapper `gradlew`](https://docs.gradle.org/current/userguide/gradle_wrapper.html).


### Installing

After cloning this repository, change into the newly created directory and run

```
./gradlew build
```

This will install all dependencies needed for the project as well as compile all source files into an executable JAR file.


## Running the Tests

All tests can be run by executing

```
./gradlew test
```

`gradlew` will automatically find all tests inside the `src/test` directory and run them.


### Testing Approach

The test for class `Example` is only verifying the return value of one method.

`App` on the other hand is tested via a test-double that gets injected.
This allows us to _spy_ on the output of it.
We want to avoid printing anything to the screen while running the tests.
Injecting a test double in this instance is a nice way to isolate our application from the command line.

In the actual `Main` class we then inject `System.out`, which is Java's standard output stream.


## Running the Application

After running `gradlew jar` the resulting JAR file is located in directory `build/libs`.
The application can now be run by executing

```
java -jar build/libs/java-gradle-command-line.jar
```


## Built With

- [Java](https://www.java.com)
- [Gradle](https://gradle.org)
- [JUnit](http://junit.org)


## License

This project is licensed under the MIT License - see the [license.md](license.md) file for details.

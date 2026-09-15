# An Event Logger which can run in CLI

This is a simple Event Logger which can run in your command line. It logs the user input along with the timestamps of when the particular event was logged.

## Overview
This program lets a user to quickly log timestamped text events to a file and review them later.When logging an event, it grabs the current date/time and saves it alongside the description to a text file

## Technology used and requiremnts
This program requires minimum java version of Java 8(JDK 8) because of `java.time.LocalDateTime` and `DateTimeFormatter`, which were introduced in Java 8
### Packages used
-   **Java I/O** (`java.io`)
-   **Java Time** (`java.time`)
-   **Java Util** (`java.util`)

## How to run
Clone the repo with

    git clone https://github.com/PremKR2505/Event-logger-cli.git
 Then compile and run the program with

     javac Eventloggercli.java
     java Eventloggercli

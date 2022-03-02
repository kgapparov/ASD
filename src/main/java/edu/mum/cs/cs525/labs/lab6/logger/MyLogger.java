package edu.mum.cs.cs525.labs.lab6.logger;

import java.sql.Timestamp;

public class MyLogger implements Logger{
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @Override
    public void log(LogLevel logLevel, String message) {
        System.out.printf("%5s:%5s:%30s\n", logLevel, timestamp.toString(), message);
    }
}

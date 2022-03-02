package edu.mum.cs.cs525.labs.lab6.logger;
import org.apache.logging.log4j.*;

public  class LoggerAdapter implements Logger{

    private org.apache.logging.log4j.Logger logger;

    public LoggerAdapter(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }
    @Override
    public void log(LogLevel logLevel, String massage) {
        logger.log(Level.getLevel(logLevel.toString()), massage);
    }
}


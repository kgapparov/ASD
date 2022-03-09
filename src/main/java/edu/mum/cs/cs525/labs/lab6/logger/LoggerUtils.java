package edu.mum.cs.cs525.labs.lab6.logger;
import org.apache.logging.log4j.*;

import static edu.mum.cs.cs525.labs.lab6.logger.LogLevel.*;

public  class LoggerUtils implements Logger{

    private org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoggerUtils.class);

    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel) {
            case INFO:
                logger.info(message);
                break;
            case DEBUG:
                logger.debug(message);
                break;
            case WARNING:
                logger.warn(message);
                break;
            case FATAL:
                logger.fatal(message);
                break;
            case TRACE:
                logger.trace(message);
            default:
                logger.info(message);
        }
    }
}
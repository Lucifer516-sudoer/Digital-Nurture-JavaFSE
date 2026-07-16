package com.dn5;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

// Just import, factory and Logger, and create new logger with factory
public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        // I am using debug statements, coz, by standard you wont be including data
        // elsewhere
        String ipAddress = "222.105.130.43";
        String user = "Peter";
        logger.debug("User: {} logger in @ {}", user, ipAddress);
    }
}

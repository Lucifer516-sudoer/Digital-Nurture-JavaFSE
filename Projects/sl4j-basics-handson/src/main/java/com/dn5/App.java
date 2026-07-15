package com.dn5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.error("The first exercise is stating me to use error first so yeah, Hello from error");
        // now warning
        logger.warn("Hey this is warning, I am gonna sleep ...");
    }
}

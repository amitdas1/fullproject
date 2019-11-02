package com.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Example {
	private static final Logger LOGGER = LogManager.getLogger(Example.class);

    public static void main(String... args) {
       int x=2;
    System.out.println("/n hello");	
    LOGGER.info("hiii");	
    LOGGER.error("hiiii"+x);
    }

    /*private static int doSomeCalculation() {
        // do some complicated calculation
   
   int  x=8;
    int y=4;
    
    return x+y;
    }*/
}

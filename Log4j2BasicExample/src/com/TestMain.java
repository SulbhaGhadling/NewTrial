package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMain {
	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		System.out.println("Main Method Started.");
		LOGGER.trace("In Trace");
		LOGGER.debug("In Debug");
		LOGGER.info("In Infor");
		LOGGER.warn("In Warn");
		LOGGER.error("In Error");

		Demo d = new Demo();
		d.m1();
		System.out.println("Main Method Finished.");
	}
}

package com.mmi.Example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4J {
	static final Logger logger = Logger.getLogger(Log4J.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Sample Debug Message");
		logger.info("Samnple info message");
		logger.warn("Sample Warn Message");
		logger.error("Sample Error Message");
		logger.fatal("Sample fatal Message");
	}
}

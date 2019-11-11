package com.mmi.Example;

import java.util.logging.Level;

public class Logger {
	public static void main(String args[]) {
		try {
			Log log_file = new Log("log.txt");
			log_file.logger.setLevel(Level.WARNING);
			log_file.logger.info("Info Message");
			log_file.logger.warning("Warning Message");
			log_file.logger.severe("Severe Message");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

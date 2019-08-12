package com.qa.automation.core;

import org.apache.log4j.Logger;

public class LogHelper {
	private static Logger log = Logger.getLogger("autologger");
	private static int testCaseId;
	private static int teststep;

	public static void setTestCaseId(int tcId) {
		testCaseId = tcId;
		teststep = 1;
		logDbgMsg("Starting Test Case: " + tcId);
	}

	public static void logTestStepMsg(String logmsg) {
		log.info("TC" + testCaseId + ":"+ "Step " + teststep + " - " + logmsg);
		teststep++;
	}
	
	public static void logDbgMsg(String logmsg) {
		log.info(logmsg);
	}
}

package log4j;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Report_4j {
	@Test
	public void report() {

		BasicConfigurator.configure();
		Logger log = Logger.getLogger(getClass().getName());
		log.error("tc error");
		log.warn("wwarning white tc runs");
		log.info("info");
	}

}

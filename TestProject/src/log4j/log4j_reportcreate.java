package log4j;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.testng.annotations.Test;

public class log4j_reportcreate {
	@Test
	public void report() throws IOException
	{
		PatternLayout layout = new PatternLayout("%d %c %m %n");
		Appender append = new FileAppender(layout, "./reports/r1.log");
		BasicConfigurator.configure(append);
		Logger log = Logger.getLogger(this.getClass().getName());
		log.error("tc error");
		log.warn("warining while testcase runs");
		log.info("info");
	}

}

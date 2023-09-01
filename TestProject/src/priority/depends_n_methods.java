package priority;

import static org.testng.Assert.fail;

import org.apache.logging.log4j.core.util.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends_n_methods {

	@Test
	public void compose() {
		Reporter.log("hello", true);
		org.testng.Assert.fail();
	}

	@Test(dependsOnMethods = "draft")
	public void sentitems() {
		Reporter.log("world", true);
	}

	@Test(dependsOnMethods = "compose")
	public void draft() {
		Reporter.log("call", true);
	}

}

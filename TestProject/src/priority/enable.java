package priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable {
	@Test(enabled = false)
	public void data1() {
		Reporter.log("hello", true);
	}

	@Test
	public void data2() {
		Reporter.log("world", true);
	}

}

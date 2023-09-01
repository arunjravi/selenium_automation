package listner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class runnerforlistener {
	@Test
	public void test1()
	{
		System.out.println("hello banglore");
	}
	
	@Test
	public void test2()
	{
		System.out.println("hello india");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("hello asia");
	}

}

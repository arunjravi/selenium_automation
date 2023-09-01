package verification_using_testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import importatnt_test_annotation.generic;

public class hard_assert extends generic{
	@Test
	public void tester() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("arunAru");
		driver.findElement(By.name("pass")).sendKeys("arunj");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log in to Facebook");
		System.out.println("one");  //execution continued test case is pass so
	}

}

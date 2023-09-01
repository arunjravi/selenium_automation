package verification_using_testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import importatnt_test_annotation.generic;

public class soft_assert extends generic{
	@Test
	public void testing2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("arunAru");
		driver.findElement(By.name("pass")).sendKeys("arunj");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "hello");//even the test case is fail it continued the exexution because of 
		System.out.println("one1");       // // assertall()
		sa.assertAll();
				
	}

}

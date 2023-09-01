package importatnt_test_annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends generic {
	@Test
	public void test1() throws InterruptedException 
	{
		driver.findElement(By.id("email")).sendKeys("arunAru");
		driver.findElement(By.name("pass")).sendKeys("arunj");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}

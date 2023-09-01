package practiceclasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import importatnt_test_annotation.generic;

public class expo1 extends generic {
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("madhu");
		driver.findElement(By.name("pass")).sendKeys("madhu123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
	
}
	
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("kiran");
		driver.findElement(By.name("pass")).sendKeys("kiran123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	

}

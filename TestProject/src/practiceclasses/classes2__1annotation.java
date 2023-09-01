package practiceclasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import importatnt_test_annotation.generic;

public class classes2__1annotation extends generic {
	@Test
	public void test3()
	{
		driver.findElement(By.id("email")).sendKeys("mahesh");
		driver.findElement(By.name("pass")).sendKeys("mahesh123");
		driver.findElement(By.name("login")).click();
	}

}

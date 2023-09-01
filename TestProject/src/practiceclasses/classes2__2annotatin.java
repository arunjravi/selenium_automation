package practiceclasses;

import org.openqa.selenium.By;

import importatnt_test_annotation.generic;

public class classes2__2annotatin extends generic {

	 {
		
		driver.findElement(By.id("email")).sendKeys("bunny");
		driver.findElement(By.name("pass")).sendKeys("bummy123");
		driver.findElement(By.name("login")).click();
	}

}

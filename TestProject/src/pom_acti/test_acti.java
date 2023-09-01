package pom_acti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_acti {
	@Test
	public void click2() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		Thread.sleep(2000);
		driver2.get("https://automation-lab/login-jsp");
		acti_pom at = new acti_pom(driver2);
		at.user("arunaru");
		Thread.sleep(2000);
		at.pass("123");
		Thread.sleep(2000);
		at.log();
	}

}

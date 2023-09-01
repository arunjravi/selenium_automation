package pom_works;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb_testspt {
	@Test
	public void click1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://www.facebook.com/");
     pom_fb p1 = new pom_fb(driver);
     p1.username("arunaru");
     Thread.sleep(2000);
     p1.pass("king");
     Thread.sleep(2000);
     p1.logclick();
	}

}

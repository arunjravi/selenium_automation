package constants;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_test1 implements framework_constants {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(gecko_key, gecko_value);
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get(base_url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}

package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.framework_constants;

public class para1  implements framework_constants{
	
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void testing(String browser) 
	{
		System.setProperty(gecko_key,gecko_value);
		System.setProperty(chrome_key,chrome_value);
		if(browser.equals("firefox"))
				{
			            driver=new FirefoxDriver();
			            driver.get("https://www.google.com/");
			            
				}
		else
		{
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
	}

}

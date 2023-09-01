package importatnt_test_annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic {
	public WebDriver driver;
@BeforeMethod
public void openApp()
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}

@AfterMethod
public void closeApp()
{
	driver.close();
}
}

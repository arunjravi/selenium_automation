package generic11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class fb_generic11 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp11()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.id("month"));
	     ArrayList<String> l = new ArrayList<String>();   //empty array list
	     Select s = new Select(ele);                     //select class
	     List<WebElement> opt = s.getOptions();
	     int count = opt.size();
	     System.out.println(count);
	     for(WebElement we:opt)
	     {
	    	 String t = we.getText();
	    	 l.add(t);
	     }
	 /////   
	}
	@AfterMethod
	public void closeApp11()
	{
		driver.close();
	}
	

}

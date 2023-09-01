package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy_page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     Thread.sleep(5000);
     driver.get("file:///C:/Users/arunn/OneDrive/Desktop/mainpage.html");
     driver.findElement(By.id("a1")).sendKeys("arunkumar");
		
		  WebElement frame = driver.findElement(By.tagName("iframe"));
		  driver.switchTo().frame(0); Thread.sleep(2000);
		  driver.findElement(By.id("p1")).sendKeys("12365");
		  
		 
		// TODO Auto-generated method stub

	}

}

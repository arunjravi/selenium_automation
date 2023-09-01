package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_frame {

		public static void main(String[] args) throws InterruptedException {



			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);
	     driver.get("https://demoqa.com/frames");
	    
	     WebElement frames = driver.findElement(By.tagName("iframes"));
		  WebDriver m = driver.switchTo().frame(1);
		  Thread.sleep(1000);
		  String t = driver.findElement(By.id("sampleHeading")).getText();
		  System.out.println(t);
			 
		  
		  

	     
		// TODO Auto-generated method stub

	}

}

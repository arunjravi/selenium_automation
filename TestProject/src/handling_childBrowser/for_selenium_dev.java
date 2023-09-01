package handling_childBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class for_selenium_dev {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.manage().window().maximize();
     driver.get("https://www.selenium.dev/");
     
     Thread.sleep(2000);
      WebElement nw = driver.findElement(By.xpath("//span[text()='Downloads']"));
      WebElement nw2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
      WebElement nw3 = driver.findElement(By.xpath("//span[text()='Projects']"));
      WebElement nw4= driver.findElement(By.xpath("//span[text()='Support']"));
      WebElement nw5 = driver.findElement(By.xpath("//span[text()='Blog']"));
      ArrayList<WebElement> arr = new ArrayList<WebElement>();
      arr.add(nw);
      arr.add(nw2);
      arr.add(nw3);
      arr.add(nw4);
      arr.add(nw5);
      Actions act = new Actions(driver);
     
      for (WebElement ob : arr) 
      {
    	  act.contextClick(ob).perform();
       Robot rb = new Robot();
       rb.keyPress(KeyEvent.VK_T);
       rb.keyRelease(KeyEvent.VK_T);
 
    
      }
      Set<String> allwh = driver.getWindowHandles();
      ArrayList<String> s1 = new ArrayList<>(allwh);
      String s = s1.get(3);
      driver.switchTo().window(s);
      
	}

	}



package NewClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_google_page {

		public static void main(String[] args) throws InterruptedException, AWTException {


			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);
	     driver.get("https://www.google.com/");
	     WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	     Actions act = new Actions(driver);
	     act.contextClick(rclick).perform();
	//      rclick.sendKeys(Keys.CONTROL,Keys.ENTER);
	     Thread.sleep(2000);
	     Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_T);
	     r.keyRelease(KeyEvent.VK_T);
		// TODO Auto-generated method stub
;
	}

}

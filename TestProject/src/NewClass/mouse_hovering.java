package NewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hovering {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://www.flipkart.com/");
     WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
     Actions act = new Actions(driver);
     act.moveToElement(ele).perform();
		// TODO Auto-generated method stub

	}

}

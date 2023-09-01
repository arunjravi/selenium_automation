package NewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_options {


		public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	     Actions act = new Actions(driver);
	     act.contextClick(rclick).perform();
		// TODO Auto-generated method stub

	}

}

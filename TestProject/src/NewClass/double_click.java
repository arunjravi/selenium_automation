package NewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {


		public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	     Actions act = new Actions(driver);
	     act.doubleClick(dclick).perform();
	     
		// TODO Auto-generated method stub

	}

}

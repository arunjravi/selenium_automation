package select_classprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledrop {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/arunn/OneDrive/Desktop/chromeuseselenium/select.html");
			WebElement ele = driver.findElement(By.id("countries"));
			Select s = new Select(ele);
			s.selectByIndex(1);
		// TODO Auto-generated method stub

	}

}

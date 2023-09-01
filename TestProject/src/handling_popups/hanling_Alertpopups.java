package handling_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hanling_Alertpopups {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://demo.guru99.com/test/delete_customer.php");
     driver.findElement(By.name("cusid")).sendKeys("arun");
     driver.findElement(By.name("submit")).click();
     Alert a = driver.switchTo().alert();
     String t = a.getText();
     System.out.println(t);
     a.accept();
	// TODO Auto-generated method stub

	}

}

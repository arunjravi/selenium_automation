package screenchots;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taking_screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		//step1
     TakesScreenshot ts = (TakesScreenshot) driver;
     // step2
     File src = ts.getScreenshotAs(OutputType.FILE);
     //step3
     File dst = new File("C:\\Users\\arunn\\OneDrive\\Desktop\\photos.jpeg");
     //step4
     org.openqa.selenium.io.FileHandler.copy(src, dst);
     
     }

}

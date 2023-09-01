package handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hading_file_upload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("file:///C:/Users/arunn/OneDrive/Desktop/fileupload.html");
     WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
    // ele.sendKeys("C:\\Users\\arunn\\OneDrive\\Desktop\\findit.txt");
     ele.sendKeys("C:\\Users\\arunn\\OneDrive\\Desktop\\mainpage.html");
		// TODO Auto-generated method st

	}

}

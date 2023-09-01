package handling_childBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_title_of_all_the_browser {
 public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     driver.findElement(By.name("NewWindow")).click();
     Set<String> allwh = driver.getWindowHandles();
     int count = allwh.size();
     System.out.println(count);
     for (String wh : allwh)
     {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}
		// TODO Auto-generated method stub

	}

}

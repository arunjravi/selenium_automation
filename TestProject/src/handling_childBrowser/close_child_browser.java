package handling_childBrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_child_browser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     String p_id = driver.getWindowHandle();
     Set<String> allwh = driver.getWindowHandles();
     int count = allwh.size();
     System.out.println(count);
     allwh.remove(p_id);
     int count1 =allwh.size();
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

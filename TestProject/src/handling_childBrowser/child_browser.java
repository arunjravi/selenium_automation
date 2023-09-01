package handling_childBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(2000);
     String wh = driver.getWindowHandle();
     System.out.println(wh);
		// TODO Auto-generated method stub

	}

}

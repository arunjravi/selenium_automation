package selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://www.facebook.com/reg/");
     WebElement ele = driver.findElement(By.id("month"));
     ArrayList<String> l = new ArrayList<String>();
     Select s = new Select(ele);
     List<WebElement> opt = s.getOptions();
     int count = opt.size();
     System.out.println(count);
     for(WebElement we:opt)
     {
    	 String t = we.getText();
    	 l.add(t);
     }
     Collections.sort(l);
     for(String t1:l)
     {
    	 System.out.println(t1);
     }
		// TODO Autgenerated method stub

	}

}

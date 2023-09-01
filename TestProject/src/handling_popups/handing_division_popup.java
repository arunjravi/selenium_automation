package handling_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handing_division_popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMI54vnibXAgAMVRoVLBR3xHgMaEAAYASAAEgJ9RPD_BwE&gclid=EAIaIQobChMI54vnibXAgAMVRoVLBR3xHgMaEAAYASAAEgJ9RPD_BwE");
	driver.findElement(By.xpath("//div[text()='Thu, Aug 3']")).click();
	driver.findElement(By.xpath("//div[text()='17']")).click();

     
     
     // TODO Auto-generated method stub

	}

}

package test_script11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic11.fb_generic11;
import pom11.pom_fb11;

public class test_fbreg extends fb_generic11  {
	@Test
	public void realtest() throws InterruptedException
	{

	pom_fb11 pom2 = new pom_fb11(driver);
	pom2.FNopt("arun");
	Thread.sleep(2000);
	
	pom2.LNopt("aru");
	Thread.sleep(2000);
	
	pom2.Mailopt("arunjravi@gmail.com");
	Thread.sleep(2000);
	
	pom2.passwdnew("12364");
	Thread.sleep(2000);
	}
	
	

}

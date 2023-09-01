package pom_acti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class acti_pom {
	@FindBy(name = "username")
	private WebElement utbox;
	@FindBy(name = "password")
	private WebElement pwdwrd;
	@FindBy (xpath = "//a[text()='login']")
	private WebElement logbtn;
	 
	
	public acti_pom(WebDriver driver2)
	{
		PageFactory.initElements(driver2, this);
	}
	
	public void user(String un)
	{
		utbox.sendKeys(un);
	}
	public void pass(String pwd)
	{
		pwdwrd.sendKeys(pwd);
	}
	public void log()
	{
		logbtn.click();
	}
	

}

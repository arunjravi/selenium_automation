package pom_works;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb {
	@FindBy(name="email")
	private WebElement namebox;
	@FindBy(name="pass")
	private WebElement passbox;
	@FindBy(name="login")
	private WebElement logbtn;
	
	
	public pom_fb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  username(String un)
	{
		namebox.sendKeys(un);
	}
	public void pass(String pwd)
	{
		passbox.sendKeys(pwd);
	}
	public void logclick()
	{
		logbtn.click();
	}

}

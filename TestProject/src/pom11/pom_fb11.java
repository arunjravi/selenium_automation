package pom11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom_fb11 {
	@FindBy(name ="firstname")
	private WebElement FN;
	@FindBy(name ="lastname")
	private WebElement LN;
	@FindBy(name ="reg_email__")
	private WebElement  MAIL;
	@FindBy(name="reg_passwd__")
	private WebElement  PWD;
	

	
	
	public pom_fb11(WebDriver driver11)
	{
		PageFactory.initElements(driver11, this);
	}
	
	public void FNopt(String fn)
	{
		FN.sendKeys(fn);
	}
	public void LNopt( String ln)
	{
		LN.sendKeys(ln);
	}
	public void Mailopt(String mail)
	{
		MAIL.sendKeys(mail);
	}
	public void passwdnew(String pwd2)
	{
		PWD.sendKeys(pwd2);
	}
	
	

}

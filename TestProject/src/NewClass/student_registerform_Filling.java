package NewClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class student_registerform_Filling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     Thread.sleep(2000);
     driver.get("https://demoqa.com/automation-practice-form");
     WebElement ele = driver.findElement(By.id("firstName"));
     ele.sendKeys("arun");
     WebElement ele2 = driver.findElement(By.id("lastName"));
     ele2.sendKeys("kumar");

     WebElement ele3 = driver.findElement(By.id("userEmail"));
     ele3.sendKeys("arunjravi5@gmail.com");
     WebElement ele9 = driver.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
     ele9.sendKeys("Maths");

     WebElement ele7 = driver.findElement(By.id("userNumber"));
     ele7.sendKeys("898899889");
     WebElement ele8 = driver.findElement(By.id("dateOfBirthInput"));
    
    Select s = new Select(ele8);
    List<WebElement> opt = s.getOptions();
    int count = opt.size();
    System.out.println(count);
     WebElement ele40= driver.findElement(By.id("currentAddress"));
     ele40.sendKeys("nothing");
     WebElement ele4 = driver.findElement(By.xpath("//input[@name=\"gender\"and @ id=\"gender-radio-1\"]"));
     ele4.click();
     WebElement ele10 = driver.findElement(By.id("hobbies-checkbox-1"));
     ele10.click();
  
     WebElement ele50= driver.findElement(By.id("dateOfBirthInput"));







     Actions act = new Actions(driver);
		// TODO Auto-generated method stub

	}

}

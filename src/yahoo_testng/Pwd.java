package yahoo_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pwd 
{
public WebDriver driver;

@FindBy(name="password")
public WebElement pwd;

@FindBy(xpath="//*[@name='verifyPassword']")
public WebElement clicksign;

@FindBy(xpath="//*[@data-error='messages.ERROR_EMPTY_PASSWORD']")
public WebElement nopwd;

@FindBy(xpath="//*[@data-error='messages.ERROR_INVALID_PASSWORD']")
public WebElement invldpwd;

public Pwd(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}
 public void pwd(String x)
 {
	 pwd.sendKeys(x);
 }
 public void cliknxt()
 {
	 clicksign.click();
 }

}

package yahoo_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages 
{
public WebDriver driver;

@FindBy(name="username")
public WebElement id;

@FindBy(xpath="//*[@id='login-signin']")
public WebElement next;

@FindBy(xpath="//*[@id='username-error']")
public WebElement nombnoer;

public Pages(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void name(String x)
{
	id.sendKeys(x);
}
public void clicksignin()
{
	next.click();
}
}

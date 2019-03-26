package yahoo_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mail
{
public WebDriver driver;

@FindBy(xpath="//*[@id='uh-mail-link']")
public WebElement mail;

public Mail(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);//code is correct
}

public void clickmail()
{
	mail.click();
}
}

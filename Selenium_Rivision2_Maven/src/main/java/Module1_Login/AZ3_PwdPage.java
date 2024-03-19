package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  AZ3_PwdPage 
{
	//step1:Declaration
	   @FindBy(xpath="//input[@type='password']")	WebElement Pwd;
	   @FindBy(xpath="//input[@id='signInSubmit']") WebElement Signin;
		
	   //step2:initialisation
	   public AZ3_PwdPage(WebDriver driver)
	   {
		PageFactory.initElements(driver, this);   
	   }
	   
	   //step3:usage
	   public void  inpAZPwdPagepwd(String Password)
	   {
		   Pwd.sendKeys(Password);
	   }
	   public void clickAZPwdPagesignin()
	   {
		   Signin.click();
	   }

}

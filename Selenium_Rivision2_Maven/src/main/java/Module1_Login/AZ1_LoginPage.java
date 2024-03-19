package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ1_LoginPage 
{
   //step1:Declaration
   @FindBy( xpath ="//a[@id='nav-link-accountList']")  private  WebElement signin;
   
               
   //step2:initialisation
  public AZ1_LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   //step3:usage
  public void clickAZLoginPageSignInBtn()
  {
	signin.click();  
  }
}

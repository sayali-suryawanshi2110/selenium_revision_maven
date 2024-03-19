package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ2_MobNumPage
{
	//step1:Declaration
   @FindBy(xpath="//input[@type='email']")	WebElement mobNum;
   @FindBy(xpath="//input[@id='continue']") WebElement logWithPwd;
	
   //step2:initialisation
   public AZ2_MobNumPage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);   
   }
   
   //step3:usage
   public void  inpAZMobNumPageMobnum(String MobileNumber)
   {
	   mobNum.sendKeys(MobileNumber);
   }
   public void clickAZMobNumPageLoginWithPwd()
   {
	   logWithPwd.click();
   }
}

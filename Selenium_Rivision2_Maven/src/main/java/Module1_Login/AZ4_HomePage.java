package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ4_HomePage
{
	//step1:Declaration
	   @FindBy(xpath="//a[@id='nav-link-accountList']")	WebElement myacc;
	  WebDriver driver;
		
	   //step2:initialisation
	   public AZ4_HomePage(WebDriver driver)
	   {
		PageFactory.initElements(driver, this); 
		this.driver=driver;
	   }
	   
	   //step3:usage
	   public void openaccoptionAZhomepagemyacc()
	   {
		  Actions act=new Actions(driver);
		  act.moveToElement(myacc).perform();
		  
	   }
	  


}

package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ7_edit_Page
{
	//step1:Declaration
	   @FindBy( xpath ="(//span[@class='a-declarative'])[5]")  private  WebElement edit;
	   
	               
	   //step2:initialisation
	  public AZ7_edit_Page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //step3:usage
	  public void clickAZEditInBtn()
	  {
		edit.click();  
	  }

}

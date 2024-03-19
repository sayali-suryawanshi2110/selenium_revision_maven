package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ6_view_Prof_page
{
	//step1:Declaration
	   @FindBy( xpath ="//a[text()='View']")  private  WebElement view;
	   
	               
	   //step2:initialisation
	  public AZ6_view_Prof_page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //step3:usage
	  public void clickAZprofilrviewBtn()
	  {
		view.click();  
	  }
}

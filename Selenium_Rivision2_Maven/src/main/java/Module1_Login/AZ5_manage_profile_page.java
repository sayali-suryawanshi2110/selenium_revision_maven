package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ5_manage_profile_page
{
	//step1:Declaration
	   @FindBy( xpath ="//span[text()='Manage Profiles']")  private  WebElement manageProf;
	   
	               
	   //step2:initialisation
	  public AZ5_manage_profile_page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //step3:usage
	  public void clickAZManageprofbtn()
	  {
		manageProf.click();  
	  }

}

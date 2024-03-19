package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AZ8_Verify_profileName_page
{

	//step1:Declaration
	   @FindBy(xpath ="//input[@id='editProfileNameInputId']")  private  WebElement profilefullName;
	   
	               
	   //step2:initialisation
	  public AZ8_Verify_profileName_page(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //step3:usage
	  
	  public String getMyProfilefullname() //use method with return type
	  {
		  String actFullname = profilefullName.getAttribute("value");
		return actFullname;
	}
//	  public void verifyMyProfileFullName( String expName)
//	  {
//		  String actName = profilefullName.getAttribute("value"); 
//		 
//		  
//	  if(actName.equals(expName))
//		  {
//			System.out.println("TC pass");  
//		  }
//		  else
//		  {
//			 System.out.println("Tc fail"); 
//		  }
//	  }
	

}

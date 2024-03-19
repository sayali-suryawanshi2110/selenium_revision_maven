package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LiabraryFiles.BaseClass;
import LiabraryFiles.UtilityClass;
import Module1_Login.AZ1_LoginPage;
import Module1_Login.AZ2_MobNumPage;
import Module1_Login.AZ3_PwdPage;
import Module1_Login.AZ4_HomePage;
import Module1_Login.AZ5_manage_profile_page;
import Module1_Login.AZ6_view_Prof_page;
import Module1_Login.AZ7_edit_Page;
import Module1_Login.AZ8_Verify_profileName_page;


public class AZTestClass_1 extends BaseClass
{
       int a;      //declare globally
       AZ1_LoginPage login;
       AZ2_MobNumPage MobNum;
       AZ3_PwdPage pwd;
       AZ4_HomePage home;
       AZ5_manage_profile_page profile;
       AZ6_view_Prof_page view;
       AZ7_edit_Page edit;
       AZ8_Verify_profileName_page verify;
       int TCID;
       
      
	@BeforeClass
    public void Openbrowser() throws EncryptedDocumentException, IOException
   {
		
		  
		  InitialiasBrowser();
		 TCID=101;
		                                 //initialise locally
		  login=new AZ1_LoginPage(driver);
		  MobNum=new AZ2_MobNumPage(driver);
		  pwd=new AZ3_PwdPage(driver);
		  home=new AZ4_HomePage(driver);
		  profile=new AZ5_manage_profile_page(driver);
		  view=new AZ6_view_Prof_page(driver);
		  edit=new AZ7_edit_Page(driver);
		  verify=new AZ8_Verify_profileName_page(driver);
		 
   }
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException
    {
	  System.out.println(a);
	  login.clickAZLoginPageSignInBtn();
	  Thread.sleep(2000);
	  MobNum.inpAZMobNumPageMobnum(UtilityClass.getPFData("MobNum"));//static method thats why classname.method name
	  MobNum.clickAZMobNumPageLoginWithPwd();
	  Thread.sleep(2000);
	  pwd.inpAZPwdPagepwd(UtilityClass.getPFData("pwd"));
	  pwd.clickAZPwdPagesignin();
	  Thread.sleep(2000);
	    
	  
    }
	@Test
     public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException
    {
	 home.openaccoptionAZhomepagemyacc();
	 profile.clickAZManageprofbtn();
	 Thread.sleep(1000);
	 view.clickAZprofilrviewBtn();
	 Thread.sleep(1000);
	 edit.clickAZEditInBtn();
	 Thread.sleep(1000);
	
	 String actFullname = verify.getMyProfilefullname();                                        //get from webpage
	 String expFullname = UtilityClass.getTestData(0, 2);  //get from exelsheet
	 
	 
	 Assert.assertEquals(actFullname, expFullname,"Failed: both results are different");
	 
    }
	
	@Test
    public void verifyFullName1()
   {
	
   }
     @AfterMethod
     public void LogoutfromApp(ITestResult s1) throws IOException
     {
 	 if(s1.getStatus()==ITestResult.FAILURE)
 	 {
 		 UtilityClass.capturesSS(driver,TCID);
 	 }
    
     }
     @AfterClass
     public void Closebrowser()
    {
    	 driver.quit();
    }


}

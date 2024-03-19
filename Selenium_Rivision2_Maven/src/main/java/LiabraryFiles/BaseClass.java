package LiabraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public void InitialiasBrowser() throws IOException 
	{
		 driver=new ChromeDriver();
		 driver.get(UtilityClass.getPFData("URL"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.manage().window().maximize();
		
	}

}

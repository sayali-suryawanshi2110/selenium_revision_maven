package LiabraryFiles;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//@author name: sayali
	//date:7/03/2024
	//this method is use to get test data from excel sheet
	//need to pass 2 inputs
	public  static String getTestData(int rowIndex ,int collIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Sayali\\OneDrive\\Desktop\\ExcelFile\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		return value;
	}
	public static void capturesSS(WebDriver driver,int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sayali\\OneDrive\\Desktop\\Screenshots"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String getPFData(String key) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\Selenium_Rivision2\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}

}

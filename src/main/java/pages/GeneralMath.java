package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import base.TestBase;

public class GeneralMath extends TestBase
{
	
	public GeneralMathPage clickGeneralMath()
	{
		String generalMath = prop.getProperty("generalMath_loc");
		driver.findElement(By.id(generalMath)).click();
		return new GeneralMathPage();
	}
	 public void loadGeneralMathFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\GeneralMathConfig.properties");
			prop = new Properties();
			prop.load(fip);
		 } 
		 catch (FileNotFoundException e)
		 {
			
			e.printStackTrace();
		 } 
		 catch (IOException e)
		 {
			
			e.printStackTrace();
		 }
	 }
	
}

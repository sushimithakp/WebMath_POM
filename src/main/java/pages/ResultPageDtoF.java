package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class ResultPageDtoF extends TestBase
{
	public DecimalToFraction backBtn()
	{
		String backBtn = prop.getProperty("backBtn_loc");
		driver.findElement(By.xpath(backBtn)).click();
		return new DecimalToFraction();
	}
	
	public void loadResultPageDtoFFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\ResultPageDtoFConfig.properties");
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

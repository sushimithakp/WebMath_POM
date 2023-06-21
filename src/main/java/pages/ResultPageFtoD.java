package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class ResultPageFtoD extends TestBase
{
	public FractionToDecimal backtoFtoD()
	{
		String btn = prop.getProperty("backToMathPb_FtoD_loc");
		driver.findElement(By.xpath(btn)).click();
		return new FractionToDecimal();
	}
	
	public void loadResultPageFtoDFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\ResultPageFtoDConfig.properties");
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

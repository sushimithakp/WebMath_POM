package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import base.TestBase;

public class GeneralMathPage extends TestBase
{
	
	public PronouncingPage clickPronouncing()
	{
		String pronouncing = prop.getProperty("pronouncing_loc");
		driver.findElement(By.linkText(pronouncing)).click();
		return new PronouncingPage();
	}
	
	public void clickFractiontoDecimal()
	{
		String fraction = prop.getProperty("fractionToDecimal_loc");
		driver.findElement(By.linkText(fraction)).click();
	}
	public void clickDecimaltoFraction()
	{
		String decimal = prop.getProperty("DecimaltoFraction_loc");
		driver.findElement(By.linkText(decimal)).click();
	}
	
	public void loadGeneralMathPageFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\GeneralMathPageConfig.properties");
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

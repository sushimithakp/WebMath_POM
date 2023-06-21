package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class FractionToDecimal extends TestBase
{
	public void clickNumerator()
	{
		String num = prop.getProperty("numerator_loc");
		driver.findElement(By.xpath(num)).click();
	}
	public void clickDenominator()
	{
		String dem = prop.getProperty("denominator_loc");
		driver.findElement(By.xpath(dem)).click();
	}
	public void clickplace()
	{
		String decimalplace  = prop.getProperty("decimalplaces_loc");
		driver.findElement(By.xpath(decimalplace)).click();
	}
	public void clearNum()
	{
		String num = prop.getProperty("numerator_loc");
		driver.findElement(By.xpath(num)).clear();
	}
	public void clearDen()
	{

		String dem = prop.getProperty("denominator_loc");
		driver.findElement(By.xpath(dem)).clear();
	}
	public void clearPlace()
	{
		String decimalplace  = prop.getProperty("decimalplaces_loc");
		driver.findElement(By.xpath(decimalplace)).clear();
		
	}
	public void dataNum(String nValue)
	{
		String num = prop.getProperty("numerator_loc");
		driver.findElement(By.xpath(num)).click();
		driver.findElement(By.xpath(num)).clear();
		driver.findElement(By.xpath(num)).sendKeys(nValue);
	}
	public void dataDen(String dValue)
	{
		String dem = prop.getProperty("denominator_loc");
		driver.findElement(By.xpath(dem)).click();
		driver.findElement(By.xpath(dem)).clear();
		driver.findElement(By.xpath(dem)).sendKeys(dValue);
	}
	public void dataPlace(String pValue)
	{
		String decimalplace  = prop.getProperty("decimalplaces_loc");
		driver.findElement(By.xpath(decimalplace)).click();
		driver.findElement(By.xpath(decimalplace)).clear();
		driver.findElement(By.xpath(decimalplace)).sendKeys(pValue);
	}
	public ResultPageFtoD clickConvert()
	{
		String cBtn = prop.getProperty("convertbtn_loc");
		driver.findElement(By.xpath(cBtn)).click();
		return new ResultPageFtoD();
	}
	
	
	
	public void loadFractionToDecimalFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\FractionToDecimalConfig.properties");
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

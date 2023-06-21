package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class DecimalToFraction extends TestBase
{
	public void clickTextBox()
	{
		String txt = prop.getProperty("Dtof_txt_loc");
		driver.findElement(By.id(txt)).click();
	}
	public void sendData(String num)
	{
		String txt = prop.getProperty("Dtof_txt_loc");
		driver.findElement(By.id(txt)).click();
		driver.findElement(By.id(txt)).sendKeys(num);
	}
	public ResultPageDtoF convert()
	{
		String btn = prop.getProperty("convert_loc");
		driver.findElement(By.xpath(btn)).click();
		return new ResultPageDtoF();
	}
	
	
	
	public void loadDecimalToFractionFile()
	 {
		 FileInputStream fip;
		 try 
		 {
			fip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\DecimalToFractionConfig.properties");
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

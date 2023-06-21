package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import base.TestBase;

public class PronouncingPage extends TestBase
{
	public void sendNum(String num1)
	{
		String txtbox = prop.getProperty("textbox_loc");
		driver.findElement(By.xpath(txtbox)).click();
		driver.findElement(By.xpath(txtbox)).sendKeys(num1);	
	}
	
	 public MathProblemPage clickpronounce()
	 {
		 String pronounce = prop.getProperty("pronounceBtn_loc");
		 driver.findElement(By.xpath(pronounce)).click();
		 return new MathProblemPage();
	 }
	  public void clickTextBox()
	  {
		  String txtbox = prop.getProperty("textbox_loc");
		  driver.findElement(By.xpath(txtbox)).click();
		  
	  }
	 public void loadPronouncingPageFile()
	 {
		FileInputStream ip;
			try 
			{
				ip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\PronouncingPageConfig.properties");
				prop = new Properties();
				prop.load(ip);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				
			}
			catch (Exception e) 
			{
				
				e.printStackTrace();
			}
	}
	
}

package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class MathProblemPage extends TestBase
{
	public PronouncingPage backToMathPb()
	{
		String clickbackToMath = prop.getProperty("backToMathPb_loc");
		driver.findElement(By.xpath(clickbackToMath)).click();
		return new  PronouncingPage();
	}
	
	public void loadAnswerSheetFile()
	 {
		FileInputStream ip;
			try 
			{
				ip = new FileInputStream("Z:\\Selenium_EXLR\\WebMath\\src\\main\\java\\config\\MathProblemPageConfig.properties");
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

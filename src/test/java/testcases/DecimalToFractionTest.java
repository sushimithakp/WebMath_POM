package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.DecimalToFraction;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DecimalToFractionTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	DecimalToFraction dTf = new DecimalToFraction();
	GeneralMathPage gmp = new GeneralMathPage();
	
  @Test(priority=36)
  public void clickTextBox() 
  {
	 
	  dTf.clickTextBox();
	  
  }
  @Test(priority=37)
  public void sendValue() 
  {
	 
	  dTf.sendData(prop.getProperty("n1"));
	  
  }
	@Test(priority=38)
	  public void convert() 
	  {
		 
		  dTf.sendData(prop.getProperty("n1"));
		  dTf.convert();
		  
	  }
	@Test(priority=39)
	  public void sendValue1() 
	  {
		 
		  dTf.sendData(prop.getProperty("n2"));
		  dTf.convert();
		  
	  }
	@Test(priority=40)
	  public void sendValue2() 
	  {
		 
		  dTf.sendData(prop.getProperty("n3"));
		  dTf.convert();
		  
	  }
	@Test(priority=41)
	  public void sendValue3() 
	  {
		 
		  dTf.sendData(prop.getProperty("n4"));
		  dTf.convert();
		  driver.switchTo().alert().accept();
	  }
	@Test(priority=42)
	  public void sendValue4() 
	  {
		 
		  dTf.sendData(prop.getProperty("n5"));
		  dTf.convert();
		  driver.switchTo().alert().accept();
	  }
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  gmp.loadGeneralMathPageFile();
	  gmp.clickDecimaltoFraction();
	  dTf.loadDecimalToFractionFile();
	  
	 
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}

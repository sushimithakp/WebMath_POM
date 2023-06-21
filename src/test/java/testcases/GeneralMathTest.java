package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GeneralMathTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	GeneralMathPage gmp = new GeneralMathPage();
	
  @Test(priority=2)
  public void generalMath() 
  {
	  gm.clickGeneralMath();
  }
  
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	 
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}

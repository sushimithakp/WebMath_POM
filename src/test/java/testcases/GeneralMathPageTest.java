package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;
import pages.PronouncingPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GeneralMathPageTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	GeneralMathPage gmp = new GeneralMathPage();
	PronouncingPage pp = new PronouncingPage();
	/*
  @Test(priority=3)
  public void pronouncing() 
  {
	  gmp.clickPronouncing();
  }*/
	@Test
	public void decimalToFraction()
	{
		gmp.clickDecimaltoFraction();
	}
  
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  gmp.loadGeneralMathPageFile();
  }

  @AfterMethod
  public void closeBrowse() 
  {
	  driver.close();
  }

}

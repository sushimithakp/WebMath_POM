package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.DecimalToFraction;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;
import pages.ResultPageDtoF;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ResultPageDtoFTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	GeneralMathPage gmp = new GeneralMathPage();
	DecimalToFraction dTf = new DecimalToFraction();
	ResultPageDtoF rs = new ResultPageDtoF();
	
  @Test(priority=43)
  public void backToDtoFPage()
  {
	  rs.backBtn();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  gmp.loadGeneralMathPageFile();
	  gmp.clickDecimaltoFraction();
	  dTf.loadDecimalToFractionFile();
	  dTf.sendData(prop.getProperty("n1"));
	  dTf.convert();
	  rs.loadResultPageDtoFFile();
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.close();
  }

}

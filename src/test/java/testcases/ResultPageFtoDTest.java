package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.FractionToDecimal;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;
import pages.ResultPageFtoD;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ResultPageFtoDTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	FractionToDecimal fTd = new FractionToDecimal();
	GeneralMathPage gmp = new GeneralMathPage();
	ResultPageFtoD rs = new ResultPageFtoD();
	
  @Test(priority=35)
  public void click() 
  {
	  rs.backtoFtoD();
  }
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  gmp.loadGeneralMathPageFile();
	  gmp.clickFractiontoDecimal();
	  fTd.loadFractionToDecimalFile();
	  fTd.dataNum(prop.getProperty("n1"));
	  fTd.dataDen(prop.getProperty("n2"));
	  fTd.dataPlace(prop.getProperty("n3"));
	  fTd.clickConvert();
	  rs.loadResultPageFtoDFile();
	  
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}

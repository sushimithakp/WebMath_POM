package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.MathProblemPage;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;
import pages.PronouncingPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MathProblemPageTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	GeneralMathPage gmp = new GeneralMathPage();
	PronouncingPage pp = new PronouncingPage();
	MathProblemPage as = new MathProblemPage();
	
	
  @Test(priority=14)
  public void clickbtn()
  {
	  as.backToMathPb();
  }
  
  
  @BeforeMethod
  public void openBrowser()
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  gmp.loadGeneralMathPageFile();
	  gmp.clickPronouncing();
	  pp.loadPronouncingPageFile();
	  String num = prop.getProperty("n1");
	  pp.sendNum(num);
	  pp.clickpronounce();
	  as.loadAnswerSheetFile();
	  
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}

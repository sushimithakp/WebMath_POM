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

public class PronouncingPageTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	GeneralMathPage gmp = new GeneralMathPage();
	PronouncingPage pp = new PronouncingPage();
	MathProblemPage as = new MathProblemPage();
	
  @Test(priority=4)
  public void sendData()  
  {
	  String num =  prop.getProperty("n1");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=5)
  public void textBox()  
  {
	   pp.clickTextBox();
  }
  
  @Test(priority=6)
  public void sendData1()  
  {
	  String num =  prop.getProperty("n2");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=7)
  public void sendData2()  
  {
	  String num =  prop.getProperty("n3");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=8)
  public void sendData3()  
  {
	  String num =  prop.getProperty("n4");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=9)
  public void sendData4()  
  {
	  String num =  prop.getProperty("n5");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=10)
  public void sendData5()  
  {
	  String num =  prop.getProperty("n6");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=11)
  public void sendData6()  
  {
	  String num =  prop.getProperty("n7");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=12)
  public void sendData7()  
  {
	  String num =  prop.getProperty("n8");
	  pp.sendNum(num);
	  pp.clickpronounce();
  }
  @Test(priority=13)
  public void sendData8()  
  {
	  pp.sendNum("");
	  pp.clickpronounce();
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
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}

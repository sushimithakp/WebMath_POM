package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.FractionToDecimal;
import pages.GeneralMath;
import pages.GeneralMathPage;
import pages.LaunchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FractionToDecimalTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	GeneralMath gm = new GeneralMath();
	FractionToDecimal fTd = new FractionToDecimal();
	GeneralMathPage gmp = new GeneralMathPage();
	
  @Test(priority=15)
  public void click() 
  {
	  gmp.clickFractiontoDecimal();
  }
 
  @Test(priority=16)
  public void clickN() 
  {
	 gmp.clickFractiontoDecimal();
	 fTd.clickNumerator();
  }
	
   @Test(priority=17)
   public void clickD() 
   {
		gmp.clickFractiontoDecimal();
		fTd.clickDenominator();
   }
   
	@Test(priority=18)
	   public void clickP() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickplace();
	   }
	@Test(priority=19)
	   public void clearN() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickNumerator();
			fTd.clearNum();
	   }
	@Test(priority=20)
	   public void clearD() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickDenominator();
			fTd.clearDen();
	   }
	@Test(priority=21)
	   public void clearP() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickplace();
			fTd.clearPlace();
	   }
	@Test(priority=22)
	   public void sendDataN() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickNumerator();
			fTd.clearNum();
			fTd.dataNum(prop.getProperty("n1"));
	   }
	@Test(priority=23)
	   public void sendDataD() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickDenominator();
			fTd.clearDen();
			fTd.dataDen(prop.getProperty("n2"));
	   }
	
	@Test(priority=24)
	   public void sendDataP() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.clickplace();
			fTd.clearPlace();
			fTd.dataPlace(prop.getProperty("n3"));
	   }

	@Test(priority=25)
	   public void sendData() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n1"));
			fTd.dataDen(prop.getProperty("n2"));
			fTd.dataPlace(prop.getProperty("n3"));
	   }
	
	@Test(priority=26)
	   public void sendData1() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n1"));
			fTd.dataDen(prop.getProperty("n2"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	
	@Test(priority=27)
	   public void sendData2() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum("");
			fTd.dataDen(prop.getProperty("n2"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	@Test(priority=28)
	   public void sendData3() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n1"));
			fTd.dataDen("");
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	@Test(priority=29)
	   public void sendData4() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n1"));
			fTd.dataDen(prop.getProperty("n2"));
			fTd.dataPlace("");
			fTd.clickConvert();
	   }
	@Test(priority=30)
	   public void sendData5() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum("");
			fTd.dataDen("");
			fTd.dataPlace("");
			fTd.clickConvert();
	   }
	@Test(priority=31)
	   public void sendData6() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n4"));
			fTd.dataDen(prop.getProperty("n5"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }

	@Test(priority=32)
	   public void sendData7() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n4"));
			fTd.dataDen(prop.getProperty("n6"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	@Test(priority=33)
	   public void sendData8() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n4"));
			fTd.dataDen(prop.getProperty("n7"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	@Test(priority=34)
	   public void sendData9() 
	   {
			gmp.clickFractiontoDecimal();
			fTd.dataNum(prop.getProperty("n7"));
			fTd.dataDen(prop.getProperty("n8"));
			fTd.dataPlace(prop.getProperty("n3"));
			fTd.clickConvert();
	   }
	
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  gm.loadGeneralMathFile();
	  gm.clickGeneralMath();
	  fTd.loadFractionToDecimalFile();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}

package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.LaunchPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LaunchPageTest extends TestBase
{
	LaunchPage lp = new LaunchPage();
	
  @Test(priority=1)
  public void launchSuccessful()
  {
	 String title = lp.getTitle();
	 Assert.assertEquals(title, prop.getProperty("title"));
	 System.out.println(title);
  }
  
  @BeforeMethod
  public void openBrowser()
  {
	  initialization();
	  lp.loadLaunchPageFile();
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}

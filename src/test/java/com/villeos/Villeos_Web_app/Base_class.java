package com.villeos.Villeos_Web_app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Base_class 
{
	WebDriver driver;
  @Test
  public void Setup1() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.browserstack.com/");
	  
  }
	  @Test
	  public void setup2()
	  {
		  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.browserstack.com/");
	  }
	  @Test
	  public void setup3()
	  {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\My_Work\\Desktop\\Villeos_project\\cicdpractice\\driver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://www.browserstack.com/");
  }

  @AfterTest
  public void TearDown()
  {
	  driver.quit();
  }

}

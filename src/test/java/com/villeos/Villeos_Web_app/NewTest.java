package com.villeos.Villeos_Web_app;

import org.testng.annotations.Test;

public class NewTest extends Base_class 
{
  @Test
  public void url() 
  {
	  driver.get("https://www.amazon.in/");
  }
}

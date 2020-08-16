package com.FlipKart.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant {
	 public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
	String browserValue=flib.getPropertyValue(PROPERTY_PATH, "browser");
	if(browserValue.equals("Chrome"))
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
	}
	else if(browserValue.equals("firefox"))
{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		
}
String appurl=flib.getPropertyValue(PROPERTY_PATH, "url");
	
		driver.get(appurl);
		driver.manage().window().maximize();
		
	}

	
		public void closeBrowser()
		{
			driver.quit();
		}

}
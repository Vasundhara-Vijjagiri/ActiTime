package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FlipKart.genericLib.BaseTest;
import com.FlipKart.genericLib.WebDriverCommonLib;

public class FlipKartLogout extends BaseTest {
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	@FindBy(xpath="//div[@class='_2aUbKa' and .='Vasundhara']") private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	public void setLogout() 
	{
		
		wlib.mouseHoverAction(logout);
	}

	
	
	@FindBy(xpath="//a[@href='#']") private WebElement log;
	 public WebElement getlog()
	 {
		 return log ;
	 }
	 public void setLog()
	 {
		 log.click();
	
	 } 
	 public FlipKartLogout(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
}
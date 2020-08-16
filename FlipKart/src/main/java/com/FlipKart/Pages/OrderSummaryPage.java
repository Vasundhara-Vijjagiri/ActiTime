package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
		
@FindBy(xpath="//button[.='CONTINUE']") private WebElement conti;

public WebElement getConti() {
	return conti;
}

public void setConti()
{
	conti.click();
}
 public OrderSummaryPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
}

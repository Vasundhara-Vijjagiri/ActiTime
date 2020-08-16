package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OutOfStockProductPage
{


@FindBy(xpath="//div[@class='_13J5uS' and .='Currently out of stock in this area.']") private WebElement outofStock;

public WebElement getOutofStock() {
	return outofStock;
}

public String setOutofStock() {
	String text=outofStock.getText();
	Reporter.log(text+" is displayed",true);
	return text;
}

public OutOfStockProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}

package com.FlipKart.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
	@FindBy(xpath="//span[@class='_2aK_gu']") private WebElement change;
	
	public WebElement getChange() {
		return change;
	}
	public void setChange() {
		change.click();
	}


	@FindBy(xpath="//input[@id='pincodeInputId']") private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}
 public void setPinCode()
 {
	 pincode.click();
	 pincode.sendKeys(Keys.CONTROL+"a");
	 pincode.sendKeys(Keys.BACK_SPACE);
	 
 }
	public void setPincode(String pin) {
		pincode.sendKeys(pin);
	}
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']") private WebElement addCart;

	public WebElement getAddCart() {
		return addCart;
	}

	public void setAddCart() {
		addCart.click();
	}
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']") private WebElement buyNow;
	
	public WebElement getBuyNow() {
		return buyNow;
	}
	public void setBuyNow() {
		buyNow.click();
	}
@FindBy(xpath="//span[@class='_2aK_gu']") private WebElement check;

	public WebElement getCheck() {
	return check;
}
public void setCheck() {
	check.click();
}
	public void buy(String pin) throws InterruptedException 
	{
		change.click();
		Thread.sleep(3000);
	//	pincode.click();
		 pincode.sendKeys(Keys.CONTROL+"a");
		 pincode.sendKeys(Keys.BACK_SPACE);
		 pincode.sendKeys(pin);
		 Thread.sleep(3000);
		 check.click();
		 Thread.sleep(3000);
		 buyNow.click();
	}
	public void add(String pin) throws InterruptedException
	{   change.click();
	    Thread.sleep(3000);
		//pincode.click();
		 pincode.sendKeys(Keys.CONTROL+"a");
		 pincode.sendKeys(Keys.BACK_SPACE);
		 pincode.sendKeys(pin);
		 Thread.sleep(3000);
		 check.click();
		 Thread.sleep(3000);
		 addCart.click();
	}
	public void add1(String pin) throws InterruptedException
	{   change.click();
	    Thread.sleep(3000);
		//pincode.click();
		 pincode.sendKeys(Keys.CONTROL+"a");
		 pincode.sendKeys(Keys.BACK_SPACE);
		 pincode.sendKeys(pin);
		 Thread.sleep(3000);
		 check.click();
	}
	public AddCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

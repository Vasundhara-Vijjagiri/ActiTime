package com.FlipKart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") private WebElement mobnoTB;
@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']") private WebElement pwTB;
@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") private WebElement loginbutn;
@FindBy(xpath="//button[.='✕']")private WebElement close;
@FindBy(xpath="//span[@class=\"_1hgiYz\"]//span[.='Login']") private WebElement loginText;
public WebElement getLoginText() {
	return loginText;
}

public String setLoginText() {
	String logText=loginText.getText();
	return logText;
}

public WebElement getMobnoTB() {
	return mobnoTB;
}
public WebElement getPwTB() {
	return pwTB;
}
public WebElement getLoginbutn() {
	return loginbutn;
}
public void setLogin(String mob,String pw) {
	mobnoTB.sendKeys(mob);
	pwTB.sendKeys(pw);
	loginbutn.click();
}

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
 
}

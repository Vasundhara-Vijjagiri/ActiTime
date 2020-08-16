package com.FlipKart.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class SearchBox {
	@FindBy(name="q") private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	public void setSearch()
	{
		search.click();
	}
    public void setSearch(String product)  {
	
    	search.sendKeys(product);
	
	}
    public void search(String product)
    {
    	search.click();
    	search.sendKeys(product);
    }
    
   
    
@FindBy(xpath="//li[@class='_1va75j']") private List<WebElement> allOptions;

public List<WebElement> enterOnProduct() {
	return allOptions;
}

public void enterOnProduct(String correctproduct) throws Throwable {
	for(int i=0;i<allOptions.size();i++)
	{
		search.sendKeys(Keys.DOWN);
		String productname=allOptions.get(i).getText();
		if(productname.equals(correctproduct))
		{  Assert.assertTrue(true);
		 Reporter.log(productname+"  product successfully Selected",true);
				search.sendKeys(Keys.ENTER);
				 break;
				 }
		Thread.sleep(1000);
		 }	
		}
		
		public SearchBox(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
	}
	}

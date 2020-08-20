package com.FlipKart.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;


/**
 * This generic class contains all the controls related to WebDriver
 * @author Vasundhara
 *
 */
public class WebDriverCommonLib extends BaseTest {
	
public String getPageTitle()
{
	String title=driver.getTitle();
	return title;
}

public void getFullPageScreenShot(String path) throws Throwable
{EventFiringWebDriver efw=new EventFiringWebDriver(driver);
File src=efw.getScreenshotAs(OutputType.FILE);
File dest=new File(path);
Files.copy(src, dest);
}

public void getElementScreenshot(String path,WebElement element) throws Throwable
{
	File src=element.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	Files.copy(src, dest);
}

public String getElementText(WebElement element)
{
	String text=element.getText();
	return text;
}
public void verifyPage(String actualPage,String expectedPage,String pageName)
{
	Assert.assertEquals(actualPage,expectedPage);
		Reporter.log(pageName+"  is Disaplayed===> Passed",true);
	}
public void verifyText(String actualText,String expectedText)
{
	Assert.assertEquals(actualText,expectedText);
		Reporter.log(" Text is Disaplayed===> Passed",true);
	}

public void waitForPageTitle(String title)
{
	WebDriverWait w=new WebDriverWait(driver,20);
	w.until(ExpectedConditions.titleIs(title));
}
public void waitForElementVisibility(WebElement element)
{
	WebDriverWait w=new WebDriverWait(driver,20);
	w.until(ExpectedConditions.visibilityOf(element));
}

public void waitforAllElements(List<WebElement> elements)
{
WebDriverWait wait=new WebDriverWait(driver,20);

wait.until(ExpectedConditions.visibilityOfAllElements(elements));

}
public void selectOption(WebElement element,int index)
{
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
public void selectOption(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void selectOption(String text,WebElement element)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public void frameSwitch(int index)
{
	driver.switchTo().frame(index);
}
public void frameSwitch(String attribute)
{
	driver.switchTo().frame(attribute);
}
public void frameSwitch(WebElement element)
{
	driver.switchTo().frame(element);
}
public void mouseHoverAction(WebElement element)
{
	Actions ac=new Actions(driver);
	ac.moveToElement(element).perform();
}
public void doubleClick(WebElement element)
{
	Actions ac=new Actions(driver);
	ac.doubleClick(element).perform();
}



public void elementDisplyed(WebElement element)
{
	if(element.isDisplayed())
	{
		Assert.assertTrue(true);
		Reporter.log(element.getText()+"  is Displyed",true);
	}
	else
	{
		
			Assert.assertTrue(false);
			Reporter.log(element.getText()+"  is not Displyed",true);
		}
	}


public void handleWindow(String WindowTitle)
{

	Set<String> allwindows = driver.getWindowHandles();
	for(String wh:allwindows)
	{
		String title=driver.switchTo().window(wh).getTitle();
		if(title.equals(WindowTitle))
		{
        Reporter.log(title + " is displayed ",true);
		break;
		}
		
		}
}

public void getTheLocation(WebElement element)
{
	Point loc=element.getLocation();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy"+loc);
}




}











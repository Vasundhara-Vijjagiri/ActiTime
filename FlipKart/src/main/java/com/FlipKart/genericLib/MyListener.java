package com.FlipKart.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener {
@Override
public void onTestStart(ITestResult result)
{
	Reporter.log(result.getName()+" method Started",true);
}
@Override
	public void onTestSuccess(ITestResult result)
	{
	Reporter.log(result.getName()+" method PASSED",true);
	}
@Override
public void onTestFailure(ITestResult result)
{
Reporter.log(result.getName()+" method Failed",true);
WebDriverCommonLib wlib=new WebDriverCommonLib();
try {
	wlib.getFullPageScreenShot("C:\\Users\\vassu\\git\\repository2\\FlipKart\\ScreenShots");
} catch (Throwable e) {
		e.printStackTrace();
}
}

@Override
public void onTestSkipped(ITestResult result)
{
	Reporter.log(result.getName()+" method skipped",true);
}
@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		}

@Override
public void onFinish(ITestContext context)
{
	Reporter.log(context.getName()+" ended",true);
}
@Override
public void onStart(ITestContext context)
{
	Reporter.log(context.getName()+" started",true);
}
}
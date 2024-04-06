package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener{

	//@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		
		
	}

	//@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("I successfully executed Listeners pass code");
	}

	//@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("I failed executed Listeners pass code" +result.getName());
	}

	//@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
	

}

package com.company.Name.PackageName;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeSuite
	public void test(){
		
		 extent = ExtentManager.getInstance();
		
	}
	
	@BeforeClass
	public void beforeclass(){
	   test = extent.createTest(getClass().getName());
	}
	
	@BeforeMethod
	public void beforeMethod(Method method){
		test.log(Status.INFO, method.getName()+"test started");
	}
	
	@AfterMethod
	public void aftermethods(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(Status.FAIL, result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, result.getName()+" Test is pass");
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(Status.SKIP, result.getThrowable());
		}
		extent.flush();
	}

}

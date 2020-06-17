package com.company.Name.PackageName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	
	
	private ThreadLocal<ChromeDriver> driver=new ThreadLocal<ChromeDriver>();
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver.set(new ChromeDriver());
		
	}
	public WebDriver getDriver(){
		return driver.get();
	}
	
	@AfterMethod
	public void tearDown(){
		getDriver().close();
	}

}

package com.company.Name.PackageName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestLogin extends BaseTest{
	
	
	 WebDriver driver;
     @Test
	public void testRun(){
		
    	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.get("https://www.google.com");
 		String actual = driver.getTitle();
 		System.out.println("Home page Title is ************* "+actual);
 		Assert.assertEquals(actual, "Google");
	}
	
}


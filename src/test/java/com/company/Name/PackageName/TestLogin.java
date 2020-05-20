package com.company.Name.PackageName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestLogin {
	
	@Test
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
		System.out.println("*****END TEST*****");
		System.out.println("***********");
	}   
}


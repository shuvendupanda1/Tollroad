package com.company.Name.PackageName;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsPage {
	
	
	
	@org.testng.annotations.Test
	public void run() {
		
		System.out.println("*****Product Details Page*****");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		System.out.println("HELLO JAVA TEST RUNNIMG");
		System.out.println("BYE");
	}
}

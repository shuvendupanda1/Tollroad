package com.company.Name.PackageName;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.out.println("HR INTREVIEW QUESTIONS");
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")).getText();
		System.out.println(text);
		
		WebElement text2 = driver.findElement(By.xpath("//div[@class='layer_cart_product_info']/span"));
		System.out.println(text2.getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='layer_cart_product_info']/span[2]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='layer_cart_product_info']/div")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='layer_cart_product_info']/div[2]")).getText());
		
		
		
		
	}

}

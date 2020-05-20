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
		//driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
<<<<<<< HEAD
        Assert.assertEquals(title, "Google");
		System.out.println("****END TEST****");
=======
		System.out.println("****END TEST****");
		Assert.assertEquals(title, "Google");
		System.out.println("*****END TEST*****");
		System.out.println("**********");
		System.out.println("*****END*****");
		Assert.assertEquals(title, "Google");
>>>>>>> 6835332eb59ddd6d63f46ab968bd45f1ee1a74e5
	}   
}


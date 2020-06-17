package com.company.Name.PackageName;

import org.testng.annotations.Test;

public class ParallelTestingP extends TestBase{
	
	@Test
	public void testcase1(){
		getDriver().get("https://www.google.com");
		System.out.println("current thread id is --- "+Thread.currentThread().getId());
		System.out.println("titile is *****"+getDriver().getTitle());
	}	
	
	@Test
	public void testcase2(){
		getDriver().get("https://www.google.com");
		System.out.println("current thread id is --- "+Thread.currentThread().getId());
		System.out.println("titile is *****"+getDriver().getTitle());
	}	
	

}

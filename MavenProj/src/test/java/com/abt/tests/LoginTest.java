package com.abt.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.abt.pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;

	@Test
	public void TestLoginPage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/selenium%20setup/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp = new LoginPage(driver);
		lp.correctLoginData();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
	
	
}

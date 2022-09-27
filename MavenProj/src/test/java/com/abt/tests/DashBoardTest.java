package com.abt.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.abt.pages.DashbordPage;
import com.abt.pages.LoginPage;

public class DashBoardTest {
	
	WebDriver driver;

@Test
	public void dashBoardTest() {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///F:/selenium%20setup/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	LoginPage lp = new LoginPage(driver);
	lp.correctLoginData();
		
	DashbordPage dp = new DashbordPage(driver);

	
	 Assert.assertEquals(dp.checkDashboardText(), "Dashboard Courses Offered");
	
	}
	
	
	
	
	
	
}

package com.abt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {

	@FindBy(xpath = "/html/body/div/div[1]/section[1]/h1")
	WebElement DashboardText;
	
	public DashbordPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	   
	public String checkDashboardText() {
		
		String ActText=DashboardText.getText();
		return  ActText ;
	}
	
	
	
	
}

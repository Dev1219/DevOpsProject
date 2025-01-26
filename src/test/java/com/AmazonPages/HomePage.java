package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {



	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver=driver;
	}

	public String getAppTitle() {

		return driver.getTitle();

	}

	public String getAppUrl() {

		return driver.getCurrentUrl();
	}

	//Private Data Member & Public Method

	
	private By searchBox = By.id("twotabsearchtextbox");

	public String enterSearchBox() {

		driver.findElement(searchBox).sendKeys("laptop dell",Keys.ENTER);
		
		return driver.getTitle();
	}



}

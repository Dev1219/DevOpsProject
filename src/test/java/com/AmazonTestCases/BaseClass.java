package com.AmazonTestCases;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.AmazonPages.HomePage;
import com.AmazonPages.LaptopPage;

public class BaseClass {

	public WebDriver driver;
	public HomePage hp;
	public LaptopPage lp;

	@BeforeTest 
	@Parameters("bName")
	public void openApplication(String bName) throws MalformedURLException, InterruptedException {

		System.out.println("\nDocker is Started!!!");

		if (bName.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"), option);
			System.out.println("\nSession for Chrome Browser is Created!!!");
			
		} else if (bName.equalsIgnoreCase("Firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"), option);
			System.out.println("\nSession for Firefox Browser is Created!!!");
			
		} else if (bName.equalsIgnoreCase("Edge")) {
			EdgeOptions option = new EdgeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"), option);
			System.out.println("\nSession for Edge Browser is Created!!!");
			
		} else {
			throw new IllegalArgumentException("Invalid browser name provided.");
		}

		// Open Application
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		System.out.println("Navigated to Amazon homepage.");
		Thread.sleep(6000);

		// Initialize page objects
		hp = new HomePage(driver);
		lp = new LaptopPage(driver);

		System.out.println("Title of Amazon HomePage: " + driver.getTitle());
	}
	
	
}







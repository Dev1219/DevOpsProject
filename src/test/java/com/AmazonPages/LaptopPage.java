package com.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPage {

    private WebDriver driver;

    // Constructor
    public LaptopPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    // Get the current URL
    public String getURl() {
        String currentUrl = driver.getCurrentUrl(); // Fetch the current URL
        System.out.println("URL of Page is: " + currentUrl);
        return currentUrl; // Return the current URL
    }

    // Get the title of the current page
    public String getTitle() {
        String title = driver.getTitle(); // Fetch the title of the page
        System.out.println("Title of Page is: " + title);
        return title; // Return the title
    }

    // click on  " Electronics " link
    public String clickOnElectronics() {
        By fashionLocator = By.linkText("Electronics");
        driver.findElement(fashionLocator).click(); // Click the "electronics" link
        String electronicsUrl = driver.getCurrentUrl(); // Fetch the URL after the click
        System.out.println("Electronics Page URL is: " + electronicsUrl);
        return electronicsUrl; // Return the new URL
    }


}

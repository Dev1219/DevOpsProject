package com.AmazonTestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaptopPageTestCases extends BaseClass {

	@BeforeClass
    public void pageSetUp() throws InterruptedException {
		
        hp.enterSearchBox(); // `enterSearchBox()` is a valid method in `HomePage`
        
        Thread.sleep(7000);
    }


	
    @Test(priority = 1)
    public void verifyUrl() throws InterruptedException {
        String actUrl = lp.getURl();
        Assert.assertTrue(actUrl.contains("del"), "Test Fail: URL does not contain 'dell'!");
        System.out.println("Test Pass: URL Matched!!!");
        Thread.sleep(7000);
    }
    
    @Test(priority = 2)
    public void verifyTitle() throws InterruptedException {
        String actTitle = lp.getTitle();
        Assert.assertTrue(actTitle.contains("del"), "Test Fail: Title does not contain 'dell'!");
        System.out.println("Test Pass: Title Matched!!!");
        Thread.sleep(7000);
    }


    @Test (priority = 3)
    public void validateElectronics() {
    	
    	String heading = lp.clickOnElectronics();
    	Assert.assertTrue(heading.contains("electronics"),"Test Fail: electronics Page URL does not contain 'electronics'!");
    	System.out.println("Test Pass: electronics Page URL Matched!!!");
    }
    
   
}
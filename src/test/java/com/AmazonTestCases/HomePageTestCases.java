package com.AmazonTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestCases extends BaseClass {
  @Test (priority =1)
  public void verifyURL() {
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("amaz"),"Test Fail: URL not Matched!!!");
	  System.out.println("Test Pass: URL Matched!!!");
  }
  
  @Test (priority =2)
  public void verifyTitle() {
	  
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("India"),"Test Fail: Title not Matched!!!");
	  System.out.println("Test Pass: Title Matched!!!");
  }
  
  @Test (priority =3)
  public void validateSearchBoxLink() {
	  
	  String nextPageUrl = hp.enterSearchBox();
	  Assert.assertTrue(nextPageUrl.contains("dell"),"Test Fail: Next Page URL not Matched!!!");
	  System.out.println("Test Pass: Next Page URL Matched!!!");
	  
  }
}

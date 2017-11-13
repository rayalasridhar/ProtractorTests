package com.poc;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import cucumber.api.testng.TestNGCucumberRunner;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
//import junit.framework.Assert;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber", "json:target/cucumber.json"})

@SuppressWarnings("unused")
public class ClsLoginFeature {
  
  static String driverPath = "IE driver path";
	public WebDriver driver;
	
	@Given("^I launch Chrome web browser$")
  public void i_launch_Chrome_web_browser() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
         //create chrome instance
         driver = new ChromeDriver(); 
         driver.manage().window().maximize();
		System.out.println("Given  Implemented");
      //throw new PendingException();
  }
  @When("^Access Glide Path Analyzer application at https://gpa\\.pimco\\.com/login$")
  public void access_Glide_Path_Analyzer_application_at_https_gpa_pimco_com_login() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://gpa.pimco.com");
	  
	  System.out.println("When  Implemented");
	  //throw new PendingException();
  }
  @Then("^I verify the displayed Web Elements on Login Page$")
  public void i_verify_the_displayed_Web_Elements_on_Login_Page() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
		System.out.println("getTagName Value==="+ driver.findElement(By.id("input_0")).getTagName());
		System.out.println("Then should be Implemented");
	
		AssertJUnit.assertEquals("Glide Path Analyzer", driver.getTitle());
	  
	 	AssertJUnit.assertTrue(driver.getPageSource().contains("Email"));
	AssertJUnit.assertTrue(driver.getPageSource().contains("Password"));
	//Assert.assertTrue(driver.getPageSource().contains("SIGN IN"));
	AssertJUnit.assertTrue(driver.getPageSource().contains("Forgot my password"));
	
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
	   // now copy the  screenshot to desired location using copyFile //method
	  FileUtils.copyFile(src, new File("D:/PoC of AngularJS App/TestResultsPoC/i_verify_the_displayed_Web_Elements_on_Login_Page.png"));
	  }
	   
	  catch (IOException e)
	   {
	    System.out.println(e.getMessage());
	   }
	  
	  
	  driver.quit();
		  
	  
  }

	
}

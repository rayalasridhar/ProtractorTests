package com.poc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;


@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions
(
	plugin = "json:src/target/cucumber-report.json", 
	features="src/test/java/resources",
	strict = false,
format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" } 
	
		
		)
public class ClsRunner extends AbstractTestNGCucumberTests 
{

	
}
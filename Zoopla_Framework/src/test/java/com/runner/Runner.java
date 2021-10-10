package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
plugin= {"pretty","json:target/cucumber.json" },			
features =".//Features/",
glue = "com.stepdefination", 	
dryRun = false, 
monochrome = true, 
tags = "@Smoke")


public class Runner extends AbstractTestNGCucumberTests {

}

package com.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basepage.Basepage;
import io.cucumber.java.en.*;


public class ZooplaStepdef extends Basepage{
	@Given("^users can open any browser$")
	public void users_can_open_any_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abidu\\eclipse-workspace\\Zoopla_Framework\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	   
	}

	@Given("^users able to enter \"([^\"]*)\" url$")
	public void users_able_to_enter_url(String arg1) {
	    
	   
	}

	@When("^users able to click on the login button$")
	public void users_able_to_click_on_the_login_button() {
	    
	   
	}

	@When("^users enter the userName \"([^\"]*)\"$")
	public void users_enter_the_userName(String arg1) {
	    
	   
	}

	@When("^users enter the  password \"([^\"]*)\"$")
	public void users_enter_the_password(String arg1) {
	    
	   
	}

	@When("^users click on the signing button$")
	public void users_click_on_the_signing_button() {
	    
	   
	}

	@Then("^users able to verify successfully login & verify the homepage title$")
	public void users_able_to_verify_successfully_login_verify_the_homepage_title() {
	    
	   
	}	
}

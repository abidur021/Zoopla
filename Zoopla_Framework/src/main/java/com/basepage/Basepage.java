package com.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {
	static WebDriver driver;
	public static void setup () {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abidu\\eclipse-workspace\\Zoopla_Framework\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

}
}
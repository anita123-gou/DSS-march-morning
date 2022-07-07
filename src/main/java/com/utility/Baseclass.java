package com.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static configuredataprovider config;
	public static exceldataprovider excel;
	
	@BeforeSuite
	
	public void Startsetup() throws IOException {
		 config=new configuredataprovider();
		 excel=new exceldataprovider();
	}
	
	@BeforeMethod
	public void setup() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	driver.get(config.getBaseUrl_QA1());
	driver.manage().window().maximize();

}
	@AfterMethod 
	public void teardown(){
		driver.quit();
	}
}

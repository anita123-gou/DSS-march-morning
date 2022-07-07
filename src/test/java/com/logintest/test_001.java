package com.logintest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.loginpom;
import com.utility.Baseclass;
import com.utility.libraryjar;

public class test_001 extends Baseclass {
	
	@Test
	
	public void Verifyloginpage() {
		
				
	//WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
	//WebElement txtpassword = driver.findElement(By.xpath("//input[@id='pass']"));
		loginpom login = PageFactory.initElements(driver, loginpom.class);	
	  
//txtemail.sendKeys("anitag010@gmail.com");
  //    txtpassword.sendKeys("anita@2345");	
	//libraryjar.custom_sendkeys(txtemail, "anitag010@gmail.com");
	//libraryjar.custom_sendkeys(txtpassword, "a12345674");
	libraryjar.custom_sendkeys(login.gettxtemail(),excel.getStringdata("Sheet1", 0, 0));
	libraryjar.custom_sendkeys(login.gettextpassword(), excel.getStringdata("Sheet1", 0, 1));
	}
	
}

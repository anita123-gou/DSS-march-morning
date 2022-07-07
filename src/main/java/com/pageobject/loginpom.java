package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	private WebElement txtemail;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pass\"]")
	private WebElement txtpassword;
	
	public WebElement gettxtemail() {
		return txtemail;
	}
	public WebElement gettextpassword() {
	return txtpassword;
	}
}


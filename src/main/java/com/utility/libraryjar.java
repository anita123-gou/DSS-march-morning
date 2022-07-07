package com.utility;

import org.openqa.selenium.WebElement;

public class libraryjar {

	public static void custom_sendkeys(WebElement element, String text) {
		
		try {
			element.sendKeys(text);
		}
		catch(Exception e)
		{System.out.println(e.getMessage());
		}
		
	}
	
}

package com.iceland.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.iceland.qa.base.TestBase;

public class HomePage extends TestBase{  
	
	    //Page Factory - OR
	    @FindBy(xpath = "//*[@id='wrapper']/header/div/div[1]/ul/li[3]/a")
	    WebElement WelcomebackTosin; 
	    
	    @FindBy(id = "logo")
	    WebElement IcelandlogoImage; 
	    
		//create constructor of this and initialised the page objects
		public HomePage(){
			PageFactory.initElements(driver, this);  
		}
		
		//Actions   
		public String verifyHomePagePageTitle(){
			return driver.getTitle();  
			
		}
		
		public boolean verifyWelcomebackTosin(){
			return WelcomebackTosin.isDisplayed();
		}
		
		public boolean verifyIcelandlogoImage(){
			return IcelandlogoImage.isDisplayed(); 
		}
}

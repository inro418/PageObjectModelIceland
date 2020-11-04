package com.iceland.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iceland.qa.base.TestBase;

public class SignInPage extends TestBase{  
	
	    //Page Factory - OR
		
	    @FindBy(id = "logo")
	    WebElement IcelandlogoImage; 
	    
	    @FindBy(xpath = "//*[@id='wrapper']/header/div/div/ul/li[3]/a[2]")
	    WebElement SignIn1; 
	    
		@FindBy(id = "dwfrm_login_username")
		WebElement Emailaddress; 
		
		@FindBy(id = "dwfrm_login_password")
		WebElement Password; 
		
		@FindBy(name = "dwfrm_login_login")
		WebElement SignInBtn;   
		
		//create constructor of this and initialised the page objects
		public SignInPage(){
			PageFactory.initElements(driver, this);  
		}
		
		//Actions   
		public String validateSignInPageTitle(){  
			return driver.getTitle();  
			
		}
		
		public boolean validateIcelandlogoImage(){
			return IcelandlogoImage.isDisplayed();   
		}
		
		public HomePage signIn(String username, String password){   
			SignIn1.click();
			Emailaddress.sendKeys(username);   
			Password.sendKeys(password); 
			SignInBtn.click();
			return new HomePage();   
			
		}
}

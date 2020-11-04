package com.iceland.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iceland.qa.base.TestBase;
import com.iceland.qa.pages.HomePage;
import com.iceland.qa.pages.SignInPage;

public class SignInPageTest extends TestBase{
 SignInPage signInPage;  
 HomePage  homePage; 
 
	//create constructor of SignInPageTest
	public SignInPageTest(){
		
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		//create objects of SignInPage
		signInPage = new SignInPage();        
	}
	
	@Test(priority = 1)
	public void SignInPageTitleTest(){  
		String title = signInPage.validateSignInPageTitle(); 
		Assert.assertEquals(title, "Online Food Shopping | Iceland Groceries");   
	}
	
	@Test(priority = 2)
	public void IcelandlogoImageTest(){
	 signInPage.validateIcelandlogoImage();
		Assert.assertTrue(true);   	
	}
	
	@Test(priority = 3)    
	public void signInPageTest(){
		homePage = signInPage.signIn(prop.getProperty("username"),prop.getProperty("password"));   
		
	}
	@AfterMethod
	public void tearDown(){ 
		driver.quit(); 
	}
	
}

package com.iceland.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.iceland.qa.base.TestBase;
import com.iceland.qa.pages.HomePage;
import com.iceland.qa.pages.SignInPage;

public class HomePageTest extends TestBase{
 SignInPage signInPage;  
 HomePage homePage;
 
	//create constructor of SignInPageTest
	public HomePageTest(){
		
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		//create objects of SignInPage

		signInPage = new SignInPage();  
		homePage = signInPage.signIn(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test (priority = 1)
	public void verifyHomePageTitle(){
		String Title =  homePage.verifyHomePagePageTitle();
		Assert.assertEquals(Title, "Online Food Shopping | Iceland Groceries");   
	}
	
	@Test (priority = 2)
	public void verifyWelcomebackTosinTest(){
		homePage.verifyWelcomebackTosin(); 
		Assert.assertTrue(true);    
	}
	
	@Test(priority = 3)
	public void verifyIcelandlogoImageHomePageTest(){
		 homePage.verifyIcelandlogoImage();
		Assert.assertTrue(true);
	}   
	
	@AfterMethod
	public void tearDown(){ 
		driver.quit(); 
	}
	
}

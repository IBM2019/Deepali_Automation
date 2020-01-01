package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super(); //to call test base constructor-prop initialization 
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	
	@Test(enabled=false)
	public void testing(){
     System.out.println("Hi4");
	}
	
	
	@Test(enabled=false)
	public void loginPageTitleTest() throws InterruptedException{
		Thread.sleep(7);
	     System.out.println("Hi1");

		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "FREE");
	}
	
	
	@Test(enabled=false)
	public void crmLogoImageTest(){
	     System.out.println("Hi2");

		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	
	@Test(enabled=true)
	public void loginTest() throws InterruptedException{
	     System.out.println("Hi3");

		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}

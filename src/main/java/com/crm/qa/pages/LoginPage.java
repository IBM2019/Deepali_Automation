package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="/html/body/div[1]/main/section[1]/a/span[2]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[@src='/images/Itunes.png']")
	WebElement crmLogo;
	
	
	@FindBy(xpath="(//span[text()='free'])[1]")
	WebElement titlePage;
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		
		titlePage.isDisplayed();
		String title=titlePage.getText();
		
		return title;
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException{
		Thread.sleep(9);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(10);
		username.sendKeys("ABCD");
		Thread.sleep(10);

		password.sendKeys("Password");
		Thread.sleep(10);

		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
				Thread.sleep(10);

		    	
		return new HomePage();
	}
	
}

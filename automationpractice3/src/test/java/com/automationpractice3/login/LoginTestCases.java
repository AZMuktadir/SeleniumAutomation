package com.automationpractice3.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestCases {



	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	
@AfterMethod

public  void closeDriver() {
	
	
	driver.close();
}
	
@Test
public   void Login_with_invalid_userid() {


//        Go to http://www.automationpractice.com

		driver.get("http://www.automationpractice.com");
//        	Click Sign in button from top right corner of the page

		WebElement Click_sign_in_button = driver.findElement(By.className("login"));

		Click_sign_in_button.click();
//        	Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		WebElement enter_invalid_email_address = driver.findElement(By.id("email"));
		enter_invalid_email_address.sendKeys("myunknowxaad@mailinator.com");

//        	Click Sign in button

		WebElement click_on_sign_in_button = driver.findElement(By.id("SubmitLogin"));
		click_on_sign_in_button.click();
//        	Verify error message displayed 'There is 1 error'

		String error_massage_display_1 = driver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		System.out.println("The error massage displayed for wrong user name:  " + error_massage_display_1 );
		Assert.assertEquals(error_massage_display_1, "There is 1 error");
		
		


//        	Verify error message displayed 'Password is required.'
		String error_massage_display_2 = driver.findElement(By.xpath("//li[text()='Password is required.']")).getText();
		System.out.println("The Error massage displayed without password typed : " + error_massage_display_2 );
		Assert.assertEquals(error_massage_display_2, "Password is required.");
		
	}
@Test
	public  void Login_with_valid_userid_but_invalid_password() {

	

//		Go to http://www.automationpractice.com
		
		driver.get("http://www.automationpractice.com");


		
//			Click Sign in button from top right corner of the page

		WebElement Click_sign_in_button = driver.findElement(By.className("login"));
		Click_sign_in_button.click();


//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
	
		WebElement enter_valid_email_address = driver.findElement(By.id("email"));
		enter_valid_email_address.sendKeys("abc213@mailinator.com");

//			Enter invalid password 'myinvalidpwd' in password text field

		WebElement enter_invalid_pd = driver.findElement(By.id("passwd"));
		enter_invalid_pd.sendKeys("myinvalidpwd");

		
		
//			Click 'Sign in' button
		
		WebElement click_on_sign_in_button = driver.findElement(By.id("SubmitLogin"));
		click_on_sign_in_button.click();



//			Verify error message displayed 'There is 1 error'
		
		String error_massage_display_1 = driver.findElement(By.xpath("//p[text()='There is 1 error']")).getText();
		System.out.println("The error massage displayed:  " + error_massage_display_1 );
		Assert.assertEquals(error_massage_display_1, "There is 1 error");
		

//			Verify error message displayed 'Authentication failed.'

		String error_massage_display_2 = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed')]")).getText();
		System.out.println("The error massage displayed:  " + error_massage_display_2 );
		Assert.assertEquals(error_massage_display_2, "Authentication failed.");
		
		
		

	}
@Test
	public  void Login_with_valid_userid_and_password() {

		

//        Go to http://www.automationpractice.com

		driver.get("http://www.automationpractice.com");

		
//        	Click Sign in button from top right corner of the page
		
		WebElement Click_sign_in_button = driver.findElement(By.className("login"));
		Click_sign_in_button.click();


		
//        	Enter valid email address 'abc213@mailinator.com' in email address text field of right side
		
		WebElement enter_valid_email_address = driver.findElement(By.id("email"));
		enter_valid_email_address.sendKeys("abc213@mailinator.com");

		
//        	Enter valid password 'abc1234' in password text field
		
		WebElement enter_valid_pd = driver.findElement(By.id("passwd"));
		enter_valid_pd.sendKeys("abc1234");

		
		
//        	Click 'Sign in' button

		WebElement click_on_sign_in_button = driver.findElement(By.id("SubmitLogin"));
		click_on_sign_in_button.click();

		

//        	Verify 'MY ACCOUNT' text displayed
		String myAccount = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
		Assert.assertEquals(myAccount, "MY ACCOUNT");
		

		
		
		
//        	Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
		
		WebElement welcome_msg = driver.findElement(By.className("info-account"));
		String msg = welcome_msg.getText();
		System.out.println("Welocme massage for new sign in account holder: " + msg);
		Assert.assertEquals(msg, "Welcome to your account. Here you can manage all of your personal information and orders.");

//        	Verify 'My personal information' text displayed
		
		WebElement text = driver.findElement(By.xpath("//span[text()='My personal information']"));
		String info = text.getText();
		System.out.println("Dispayed My personal info in the person tab: " + info);
		Assert.assertEquals(info, "MY PERSONAL INFORMATION");

		
//        	Click 'Sign out' button from top right corner
		
		WebElement click_signout_button = driver.findElement(By.className("logout"));
		click_signout_button.click();

		

	}

}

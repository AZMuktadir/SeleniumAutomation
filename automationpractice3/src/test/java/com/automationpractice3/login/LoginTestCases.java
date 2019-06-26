package com.automationpractice3.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
	
	
public static void main(String[] args)  { 
	login_001();
	login_002();
	login_003();
	}
	
	@Test
	public static void login_001() {
		
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        
//        Go to http://www.automationpractice.com
        
        driver.get("http://www.automationpractice.com");
//        	Click Sign in button from top right corner of the page
        
        WebElement Click_sign_in_button=driver.findElement(By.className("login"));
        
        Click_sign_in_button.click();
//        	Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
        WebElement enter_invalid_email_address=driver.findElement(By.id("email"));
        enter_invalid_email_address.sendKeys("myunknowxaad@mailinator.com");
        
        
//        	Click Sign in button
        
       WebElement click_on_sign_in_button=driver.findElement(By.id("SubmitLogin"));
       click_on_sign_in_button.click();
//        	Verify error message displayed 'There is 1 error'
       
//      WebElement s=driver.findElement(By.tagName("p"));
//      String msg=s.getText(); 
//      System.out.println(msg);
       
       
       String s=driver.findElement(By.xpath("//p[contains(text(),'There')]")).getText();
       System.out.println(s);
       
       
       
//        	Verify error message displayed 'Password is required.'
       String s1=driver.findElement(By.xpath("//li[text()='Password is required.']")).getText();
       System.out.println(s1);
       driver.close();
}
	
	public static void login_002() {
		
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
		
//		Go to http://www.automationpractice.com
        driver.get("http://www.automationpractice.com");
		
//			Click Sign in button from top right corner of the page
        
        WebElement Click_sign_in_button=driver.findElement(By.className("login"));
        Click_sign_in_button.click();
        
        
//			Enter valid email address 'abc213@mailinator.com' in email address text field of right side
        WebElement enter_valid_email_address=driver.findElement(By.id("email"));
        enter_valid_email_address.sendKeys("abc213@mailinator.com");
        
        
//			Enter invalid password 'myinvalidpwd' in password text field
        
        WebElement enter_invalid_pd=driver.findElement(By.id("passwd"));
        enter_invalid_pd.sendKeys("myinvalidpwd");
        
//			Click 'Sign in' button
        WebElement click_on_sign_in_button=driver.findElement(By.id("SubmitLogin"));
        click_on_sign_in_button.click();
//			Verify error message displayed 'There is 1 error'
        String e=driver.findElement(By.xpath("//*[@id='center_column']/div[1]/p")).getText();
        System.out.println(e);
        
//			Verify error message displayed 'Authentication failed.'
        
        
        String e1=driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li")).getText();
        System.out.println(e1);
        driver.close();
		
	}
	
	public static void login_003() {
		
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
		
		
//        Go to http://www.automationpractice.com
        
        driver.get("http://www.automationpractice.com");
//        	Click Sign in button from top right corner of the page
        WebElement Click_sign_in_button=driver.findElement(By.className("login"));
        Click_sign_in_button.click();
        
//        	Enter valid email address 'abc213@mailinator.com' in email address text field of right side
        WebElement enter_valid_email_address=driver.findElement(By.id("email"));
        enter_valid_email_address.sendKeys("abc213@mailinator.com");
        
//        	Enter valid password 'abc1234' in password text field
        WebElement enter_valid_pd=driver.findElement(By.id("passwd"));
        enter_valid_pd.sendKeys("abc1234");
        
        
//        	Click 'Sign in' button
        
        WebElement click_on_sign_in_button=driver.findElement(By.id("SubmitLogin"));
        click_on_sign_in_button.click();
//        	Verify 'MY ACCOUNT' text displayed
        String s=driver.findElement(By.className("navigation_page")).getText();
        System.out.println(s);
//        	Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
        WebElement welcome_msg=driver.findElement(By.className("info-account"));
        String msg= welcome_msg.getText();
        System.out.println(msg);
        
//        	Verify 'My personal information' text displayed
        WebElement text =driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[4]/a/span"));
        String info=text.getText();
        
        System.out.println(info);
//        	Click 'Sign out' button from top right corner
        WebElement click_signout_button=driver.findElement(By.className("logout"));
        click_signout_button.click();
		
        driver.close();
		
	}
	
}

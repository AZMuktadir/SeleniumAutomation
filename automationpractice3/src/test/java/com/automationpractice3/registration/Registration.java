package com.automationpractice3.registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	
	public static void main(String[] args)  { 
		
		Registration_001();
	}
	
	public static void Registration_001() {
		
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        
        
        
//        Step 1	Go to http://www.automationpractice.com
        
        driver.get("http://www.automationpractice.com");
//        	Step 2	Click Sign in button from top right corner of the page
       WebElement Click_sign_in_button=driver.findElement(By.className("login"));
       
       Click_sign_in_button.click();
       
//        	Step 3	Enter email address 'abc@mailinator.com' in email address text field of left side
       
       WebElement Enter_email_address=driver.findElement(By.id("email_create"));
       Enter_email_address.sendKeys("abc213@mailinator.com");
       
       
//        	Step 4	Click create an account button
       WebElement Click_on_create_account=driver.findElement(By.id("SubmitCreate"));
       
       Click_on_create_account.click();
       
//        	Step 5	Verify error message displayed 'An account using this email address has already been registered. Please enter a valid password or request a new one.'
       
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//       String s=driver.findElement(By.xpath("//*[@id=\'create_account_error\']/ol/li/text()")).getText();
//       System.out.println(s);
       
       //????
     
//        	Step 6	Enter a valid email address in email address text field. (You can use xxxxxxx@mailinator.com)
       
       WebElement Enter_email_address1=driver.findElement(By.id("email_create"));
       Enter_email_address1.clear();
       Enter_email_address1.sendKeys("a21z@mailinator.com");
       Click_on_create_account.click();
//       
//        	Step 7	Click create an account button
//        	Step 8	Click 'Register' button
//        	Step 9	Verify error message displayed 'You must register at least one phone number.'
//        	Step 10	Verify error message displayed 'lastname is required.'
//        	Step 11	Verify error message displayed 'firstname is required.'
//        	Step 12	Verify error message displayed 'passwd is required.'
//        	Step 13	Verify error message displayed 'address1 is required.'
//        	Step 14	Verify error message displayed 'city is required.'
//        	Step 15	Verify error message displayed 'The Zip/Postal code you've entered is invalid. It must follow this format: 00000'
//        	Step 16	Verify error message displayed 'This country requires you to choose a State.'
//        	Step 17	Select 'Mr' radio button
//        	Step 18	Enter First name as 'John'
//        	Step 19	Enter Last name as 'Smith'
//        	Step 20	Verify Email text box has email address defined as used in step 6
//        	Step 21	Enter password as 'MyStrong_Password'
//        	Step 22	Select day 15 from day dropdown
//        	Step 23	Select year 1984 from year dropdown
//        	Step 24	Select month September from month dropdown
//        	Step 25	Verify First name text field below has first name defined as used in step 18
//        	Step 26	Verify First name text field below has last name defined as used in step 19
//        	Step 27	Enter Company as 'Time and Training' in Company text field
//        	Step 28	Enter address as '123 abc street' in address text field
//        	Step 29	Enter city New York in city text field
//        	Step 30	Select state New York from state drop down
//        	Step 31	Enter '10001' in Zip/Postal Code text field
//        	Step 32	Select country United States from country dropdown
//        	Step 33	Enter text 'Registering ac account with all fields' in Additional information text area
//        	Step 34	Enter '7031234567' in Home Phone text field
//        	Step 35	Enter Enter '7039876543214' in Mobile phone text field
//        	Step 36	Replace text 'My Address' to 'Home' in Assign an address alias for future reference text field
//        	Step 37	Click 'Register' button
//        	Step 38	Verify 'MY ACCOUNT' text displayed
//        	Step 39	Verify 'Welcome to your account. Here you can manage all of your personal information and orders.' text displayed
//        	Step 40	Verify 'My personal information' text displayed
//        	Step 41	Click 'Sign out' button from top right corner
//		
		
	}
	
	

}

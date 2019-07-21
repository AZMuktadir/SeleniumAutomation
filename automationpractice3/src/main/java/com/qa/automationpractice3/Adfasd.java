package com.qa.automationpractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Adfasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
				driver.get("http://www.automationpractice.com");
					
				//Step 2	Click Sign in button from top right corner of the page
				driver.findElement(By.xpath("//a[@class='login']")).click(); 
					
//				//Step 3	Enter email address 'abc@mailinator.com' in email address text field of left side above "Create an account" button.
//				driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abc@mailinator.com");
//
//				//Step 4	Click create an account button
//				driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
//					
//				//Step 5: Verify error message displayed 'An account using this email address has already been registered. Please enter a valid password or request a new one.'
//				String registered_error = driver.findElement(By.xpath("//LI[text()='An account using this email address has already been registered. Please enter a valid password or request a new one. ']")).getText();
//				System.out.println("Finding registered error is: " +registered_error);
				
						
				//Step#6--Enter a valid email address (auto) in email address text field. (You can use xxxxxxx@mailinator.com)
				//driver.findElement(By.xpath("//input[@id='email_create']")).clear();
				//driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("aza012" + randomInt + "abd@gmail.com");
				
				//Step 6	Enter a valid email address (manual) in email address text field. (You can use 10*-Sharp@mailinator.com)
				driver.findElement(By.xpath("//input[@id='email_create']")).clear();
				driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Sharp@mailinator.com");
				
				//Step 7	Click create an account button
			    driver.findElement(By.id("SubmitCreate")).click();
			       
			    //Step 8	Click 'Register' button
			    driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

			    
			    
			 
				  //Step 9	Verify error message displayed 'You must register at least one phone number.'
				  //Step 10	Verify error message displayed 'lastname is required.'
				  //Step 11	Verify error message displayed 'firstname is required.'
				  //Step 12	Verify error message displayed 'passwd is required.'
				  //Step 13	Verify error message displayed 'address1 is required.'
				  //Step 14	Verify error message displayed 'city is required.'
				  //Step 15	Verify error message displayed 'The Zip/Postal code you've entered is invalid. It must follow this format: 00000'
				  //Step 16	Verify error message displayed 'This country requires you to choose a State.'
			    
			    //to verify all the message at once we can loop, store all the msgs in array and verify each using for loop
			    String errorMsgs1=driver.findElement(By.xpath("//ol[preceding-sibling::p[contains(text(),'There are 8 errors')]]")).getText(); 
	System.out.println(errorMsgs1);
	
	}

}

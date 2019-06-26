package com.qa.automationpractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		// Open the Browser
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       
        //Navigate to automationpractice.com url
        driver.get("http://www.automationpractice.com");
       
        // Click on sign-in Button
        WebElement sign_in_button=driver.findElement(By.className("login"));
        sign_in_button.click();
       
        
        //enter the email address
        WebElement email_box=driver.findElement(By.id("email"));
        email_box.sendKeys("abc213@mailinator.com");
        
        
        //enter the password
        WebElement password_box=driver.findElement(By.id("passwd"));
        password_box.sendKeys("abc1234");
        
        // click submit button
        WebElement login_button=driver.findElement(By.id("SubmitLogin"));
        login_button.click();
        
     
        // get welcome massage
        WebElement welcome_msg=driver.findElement(By.className("info-account"));
        String msg= welcome_msg.getText();
        System.out.println(msg);
       
        
        System.out.println("Hello World");
        //driver.close();
        
        
	}

}

package com.qa.automationpractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        

        
        driver.get("http://www.automationpractice.com");
        driver.findElement(By.xpath("//a[@title='Women']")).click();
        
      //  driver.close();


	}

}

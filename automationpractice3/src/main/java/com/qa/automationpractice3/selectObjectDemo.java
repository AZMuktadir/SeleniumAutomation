package com.qa.automationpractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selectObjectDemo {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	
	@Test
	public void selectOptionFromDropDown() {
		
		driver.get("https://www.timeandtraining.net/seleniumdemo/selenium.html");
		
	WebElement element= driver.findElement(By.xpath("(//select[@name='DemoDropDown'])[1]"));
		
		Select dropdown_language = new Select(element);
		dropdown_language.selectByVisibleText("PHP");
		
	}
	
	
	
	

}

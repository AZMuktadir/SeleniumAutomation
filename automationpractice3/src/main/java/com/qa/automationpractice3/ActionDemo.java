package com.qa.automationpractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionDemo {
	
	
	
	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
//	@Test
//	public void mosueOverAction() {
//		
//		driver.get("https://www.timeandtraining.net/seleniumdemo/selenium.html");
//		
//		Actions action = new Actions(driver);
//		WebElement red_button = driver.findElement(By.xpath("//li[contains(@onmouseover, 'Red means danger')]"));
//		
//		action.moveToElement(red_button).build().perform();
//		
//		
//	}
	
//	@Test
//	
//	public void dragAndDrop() {
//		
//		
//driver.get("https://www.timeandtraining.net/seleniumdemo/selenium.html");
//		
//		Actions action = new Actions(driver);
//		
//		WebElement source = driver.findElement(By.id("drag"));
//		WebElement target = driver.findElement(By.id("drop"));
//		
//		action.dragAndDrop(source, target).build().perform();
//		
//	}
	
	@Test
	
	public void keyPressByAction() {
		
driver.get("https://www.timeandtraining.net/seleniumdemo/selenium.html");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	

}

package com.qa.automationpractice3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverwaitDemo {

	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void waitDemoOne() throws InterruptedException {
		
		driver.get("https://timeandtraining.net/seleniumdemo/selenium.html");
		//Thread.sleep(35000);
	//	String btnMsg=driver.findElement(By.xpath("//button[contains(text(),'Now I am present after')]")).getText();
	WebDriverWait wait = new WebDriverWait(driver,120);
	WebElement quote=driver.findElement(By.id("explicitWaitTextPresentDemo"));
	wait.until(ExpectedConditions.textToBePresentInElement(quote, "“Dream is not the thing you see in sleep but is that thing that doesn't let you sleep.”"));
		String btnMsg=driver.findElement(By.id("explicitWaitTextPresentDemo")).getText();
		System.out.println(btnMsg);
	}
	
}

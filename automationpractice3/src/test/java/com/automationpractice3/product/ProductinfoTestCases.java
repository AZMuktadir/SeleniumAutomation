package com.automationpractice3.product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductinfoTestCases {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void launchWebDriver() {
				System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	
//@AfterMethod
//
//public  void closeDriver() {
//	
//	
//	driver.close();
//}


@Test
public void Review_on_product()
{
	
//  Go to http://www.automationpractice.com

	driver.get("http://www.automationpractice.com");

	
//  	Click Sign in button from top right corner of the page
	
	WebElement Click_sign_in_button = driver.findElement(By.className("login"));
	Click_sign_in_button.click();


	
//  	Enter valid email address 'abc213@mailinator.com' in email address text field of right side
	
	WebElement enter_valid_email_address = driver.findElement(By.id("email"));
	enter_valid_email_address.sendKeys("abc213@mailinator.com");

	
//  	Enter valid password 'abc1234' in password text field
	
	WebElement enter_valid_pd = driver.findElement(By.id("passwd"));
	enter_valid_pd.sendKeys("abc1234");

	
	
//  	Click 'Sign in' button

	WebElement click_on_sign_in_button = driver.findElement(By.id("SubmitLogin"));
	click_on_sign_in_button.click();
	
//	Go to http://automationpractice.com/index.php?id_product=7&controller=product
	
	driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
	
	
	
//		Click on Write a review
	driver.findElement(By.className("open-comment-form")).click();
	
	
//		Click Send button without typing anything
	driver.findElement(By.xpath("//*[@id=\"submitNewMessage\"]/span")).click();
	
	
	
	
//		Verify 'Title is incorrect' text displayed
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	String title_incorrect_displayed = driver.findElement(By.xpath("//li[text()='Title is incorrect']")).getText();
	System.out.println("Text displayed for blank : " + title_incorrect_displayed);
	System.out.println("******************************************");
	Assert.assertEquals(title_incorrect_displayed, "Title is incorrect");
	
	
	
	
//		Verify 'Comment is incorrect' text displayed
	
//	String comment_incorrect_displayed = driver.findElement(By.xpath("//li[text()='Comment is incorrect']")).getText();
//	System.out.println("Text displayed for blank comment box: " + comment_incorrect_displayed);
//	System.out.println("******************************************");
//	Assert.assertEquals(comment_incorrect_displayed, "Comment is incorrect");
	
	
	
//		Enter 'Awesome dress' in title
	
	WebElement write_on_title_box=driver.findElement(By.id("comment_title"));
	write_on_title_box.sendKeys("Awesome dress");
//		Enter 'Best purchase ever!!!' in Comment
	
	WebElement write_on_comment_box=driver.findElement(By.id("content"));
	write_on_comment_box.sendKeys("Best purchase ever!!!!");
	
	
	
	
	
//		Click Send button
	
	driver.findElement(By.xpath("//*[@id=\"submitNewMessage\"]/span")).click();
//		Verify 'Your comment has been added and will be available once approved by a moderator' text displayed in popup
	
	String comment_added_popup=driver.findElement(By.xpath("//p[contains(text(),'Your comment')]")).getText();
	System.out.println("text displayed on popup : " + comment_added_popup);
	System.out.println("******************************************");
	Assert.assertEquals(comment_added_popup, "Your comment has been added and will be available once approved by a moderator");
	
	
//		Click OK
	
	WebElement click_ok_button=driver.findElement(By.xpath("//span[text()='OK']"));
	click_ok_button.click();
	
//		Verify 'write a review' button gets appeared after few seconds
	try {
		String review_button=driver.findElement(By.className("open-comment-form")).getText();
		System.out.println("review_button");
	} catch (Exception e) {
		System.out.println("write a review button not appear");
	}
	
	
	
	
	
}

@Test
public void Discounted_product_listing() {
	
	
	


//	Go to http://automationpractice.com/index.php
	
	driver.get("http://automationpractice.com/index.php");
	
	
	
	
	
//	Verify -5% displayed on product 'Printed Summer Dress'
	
	String actual_text=driver.findElement(By.xpath("(//span[text()='-5%'])[2]")).getText();
	System.out.println("Text displayed : " + actual_text);
	String expected_text="-5%";
	Assert.assertEquals(actual_text, expected_text);
	
	
	
	
	
//	Click on More for this product
	
	driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[2]/span")).click();
	
	
	
	
	
//	Verify -5% also displays on right side

	String actual =driver.findElement(By.id("reduction_percent_display")).getText();
	System.out.println("Text displayed : " + actual);
	String expected = "-5%";
	Assert.assertEquals(actual, expected);
	
	
	
	
	
}
 @Test 
 public void Color_choosing_on_product() {
	 
//	 Go to http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue
	 
	 driver.get("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue");
	 
//		 Click colour button 'blue' from right side
//		 Verify left side image changes
//		 Click colour orange now
//		 Verify image on left side is not the same one before
 }

@Test
public void Product_compare() {
	

//Training Keyword::Explicit wait; Select; For loop	
	
//	Go to http://www.automationpractice.com
	
	driver.get("http://www.automationpractice.com");
	
	
//		Enter 'Dress' in search text box on top
	driver.findElement(By.id("search_query_top")).sendKeys("Dress");
	
//		Click on search button icon
	
	driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).click();
//		Click 'Add to Compare' link for first product
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[3]/div[2]/a")).click();
	
//		Verify On top right of panel, Green Compare button has text 'Compare (1)' 
	driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	String Actual_text=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div[2]/form/button/span")).getText();
	System.out.println(Actual_text);
	
	
//		Click 'Add to Compare' link for second product now
	
//		Verify On top right of panel, Green Compare button text changes to  'Compare (2)' 
//		Click on Green Compare button
//		Verify Properties for first product is: Short Dress
//		Verify Properties for second product is: Maxi Dress
//		Verify Styles for first product is: Dressy
//		Verify Style for second product is: Casual
//		Verify Compositions for first product is: Viscose
//		Verify Properties for second product is: Viscose
//		Verify Price for first product is: $50.99
//		Verify Price for second product is: $28.98 and 'reduced price' also displayed
//		Delete second product from compare list by clicking delete button on right top of the product
//		Verify second product is not in the list any more
	
	
}

}


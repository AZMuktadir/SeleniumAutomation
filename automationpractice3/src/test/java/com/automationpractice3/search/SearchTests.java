package com.automationpractice3.search;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTests {

	public static void main(String[] args) throws InterruptedException { 
		
		Search_003_Product_image_view();
	}
	
	
	public static void Search_003_Product_image_view() throws InterruptedException {
		
	
	
		// open ChromeBrowser
		System.setProperty("webdriver.chrome.driver","lib\\chromedriver.exe");
       
		WebDriver driver= new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Go to http://automationpractice.com/index.php?id_product=7&controller=product
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");
        driver.manage().window().maximize();

       
       //      Verify there are 4 thumbnail on the page        
        List<WebElement> all_image_tags=driver.findElements(By.xpath("//img[contains(@id,'thumb_')]"));
        System.out.println(all_image_tags.size());

        
        for (int i = 0; i < all_image_tags.size(); i++) {
        	//click on the first thumbnail
        	
        	  WebElement e = all_image_tags.get(i);
        	  e.click();

        	  //verify popup displayed to slideshow

        	  //Click next button and verify image changes, do the same for four images

        	  //close the popup  
        	  
        	  
        	  
        	  driver.findElement(By.xpath("//a[@title='Close']")).click();
        	  Thread.sleep(2000);
        	
			
		}
        
        driver.close();
        
        


		
		
	}
	
	
	
	
}

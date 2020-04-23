package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// And DriverI Goto NMKT.com Login Page
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//Handling Drop down
		//---------------------------
			//WebElement drp=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7\"]"));
			//Select dropdown=new Select(drp);
		
			Select dropdown=new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
				
		// 1)Find how many options present in drop down
			System.out.println("No of Options present in drop down:" +dropdown.getOptions().size());
		
		//2) Extract all the options and print them
			
			List <WebElement> options=dropdown.getOptions();
			
			for(WebElement e:options)
			{
				System.out.println(e.getText());
			}
		//3) Select option from the dropdown 
			//dropdown.selectByVisibleText("Morning");
			//dropdown.selectByIndex(3); //Evening  --> index starts from 0
			dropdown.selectByValue("Radio-1"); //aFTERNOON


	}

}

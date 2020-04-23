package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountingLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// reading all the links from web page and display
		
		for (WebElement e: links) {
			
			System.out.println(e.getText());
			
			
		}
		driver.quit();
		
	}

}

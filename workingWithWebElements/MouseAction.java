package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).build().perform();//Double click
		Thread.sleep(3000);
	}

}

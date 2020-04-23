package workingWithWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();// maximize the page
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // implicit wait
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		driver.switchTo().alert().accept();
	}

}

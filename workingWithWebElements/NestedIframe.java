package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// And DriverI Goto NMKT.com Login Page
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	driver.switchTo().frame(outerframe);//swicth to outer frame
	
	WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	driver.switchTo().frame(innerframe);
	
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing");
	}

}

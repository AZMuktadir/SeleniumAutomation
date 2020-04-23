package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// And DriverI Goto NMKT.com Login Page
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mainMenu).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Windows")).click();
		
					}
	}



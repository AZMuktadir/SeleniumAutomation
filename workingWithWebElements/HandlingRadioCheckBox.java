package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// And DriverI Goto NMKT.com Login Page
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		// Handling radio buttons
		// ----------------------------
		// Conditional commands

		WebElement radmale = driver.findElement(By.xpath("//*[contains(text(),'Male')]"));

		System.out.println(radmale.isDisplayed()); // check displayed or not - true

		System.out.println(radmale.isEnabled()); // checks enable or not - true

		System.out.println("Before selecting radio button , the status is:" + radmale.isSelected()); // false
		radmale.click();

		Thread.sleep(2000);

		WebElement clickSun = driver.findElement(By.xpath("//*[contains(text(),'Sunday')]"));
		clickSun.click();

		WebElement clickMon = driver.findElement(By.xpath("//*[contains(text(),'Monday')]"));
		clickMon.click();

		WebElement clickWed = driver.findElement(By.xpath("//*[contains(text(),'Wednesday')]"));
		clickWed.click();
		System.out.println("days are selected");

	}

}

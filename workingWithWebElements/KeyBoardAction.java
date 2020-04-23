package workingWithWebElements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);

		act.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.DELETE).build().perform();

	}

}

package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement sourceElement= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(driver);
		
		act.dragAndDrop(sourceElement, targetElement).build().perform();
	}

}

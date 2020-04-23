package workingWithWebElements;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickingFromCalender {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		String month = "June";
		//String date = "25";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		
		
		Calendar cal =Calendar.getInstance();
		
		int d= cal.get(Calendar.DATE);
		System.out.println(d);
		String date=String.valueOf(d);
		driver.findElement(By.linkText(date)).click();
		
		// selectCurrenDate();
		// selectFutureDate(date,month);
		// selectPastDate(date,month);
	}

	
 

}

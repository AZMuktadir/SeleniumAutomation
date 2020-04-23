package workingWithWebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandingBrowserWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String handleValue=driver.getWindowHandle();
		System.out.println(handleValue); //CDwindow-45FEE686DED3D844347AB3AC2E7F5E41
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set <String> handlevalues=driver.getWindowHandles();
		
		for(String h:handlevalues)
		{
			//System.out.println(h);
			String title=driver.switchTo().window(h).getTitle();
			//System.out.println(title);
			
			if(title.equals("Sakinalium | Home") )
			{
				driver.findElement(By.xpath("//*[@id=\"container\"]/header/div/div/div[2]/ul/li[4]/a")).click(); //contact menu
			}
	}

	}
	
}

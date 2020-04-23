package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableOperationWithDifferentFeature {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		// Printing table header of a web table assuming first row as header
				System.out.println("Printing all header of table assuming first row as header: ");
				List<WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
				System.out.println("Headers in table are below:");
				System.out.println("Total headers found: "+allHeadersOfTable.size());
				for(WebElement header:allHeadersOfTable)
				{
					System.out.println(header.getText());
				}
				Thread.sleep(3000);
				// Finding number of rows in a web table. We need to exclude header to get actual number of data rows
				System.out.println("Retrieving total number of data rows:");
				List<WebElement> allRows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
				System.out.println("Total data rows found in table:"+ (allRows.size()-1));
				System.out.println("=====================================================================");
				// Find number of columns in each row
				System.out.println("Retrieving total number of columns for each row:");
				for(int i=2;i<=allRows.size();i++)
				{
					List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
					System.out.println("Number of columns in "+(i-1)+" data row is:"+allColumnsInRow.size());
				}
				System.out.println("=====================================================================");
				Thread.sleep(3000);
				//Print each rows and columns from web table
				System.out.println("Printing all column value: ");
				for(int i=2;i<=allRows.size();i++)
				{
					List<WebElement> allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
					for(int j=0;j<allColumnsInRow.size();j++)
					{
						System.out.print(allColumnsInRow.get(j).getText()+"  ");
					}
					System.out.println();
				}
				System.out.println("=====================================================================");
	}

}

package workingWithWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableOperationWithDifferentFeature1 {

	public static void main(String[] args) throws InterruptedException {
		int rows_count,col_count;
		String cellText = null;
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement Table = driver.findElement(By.ByClassName.className("dataTable"));
		
		//Read specific cell value
		WebElement cell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
		System.out.println("Data for Row 2 and Column 3 is "+cell.getText()+".");
		
		//Fetch Number of of rows in a table
		List<WebElement> rows = Table.findElements(By.tagName("tr"));
		rows_count = rows.size();
		System.out.println("Company "+  "    " + "Group" + " " + " Prev Close" );
		//Iterate through the rows
		for(int i= 0; i<rows_count; i++){
			//Fetch # of columns in a row
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			col_count = columns.size();
			
			//Iterate through the columns within particular row
			for(int j=0; j<col_count-2; j++){
				cellText = columns.get(j).getText();
				System.out.print(cellText+"  ");
			}
			System.out.println(" ");
		}
	}

}

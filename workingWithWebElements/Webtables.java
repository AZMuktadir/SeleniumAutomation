package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		//login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		//Admin-->Usermanagement-->Users
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		//Counting number of rows
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		
		
		System.out.println(rows);
		int count=0;
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++; //1 2 3........
			}
			
		}
		
		System.out.println("Number of enabled employees:"+ count);
		System.out.println("Number of disabled employees:"+ (rows-count));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int numCol=driver.findElements(By.xpath("//body//th")).size();
//		System.out.println(numCol);
//		System.out.println("Username" + "        "   + "User Role " + "         " +      "Employee Name " + "       "  +  "  Status   ");
//		
//		for (int i = 2; i<=rows; i++) {
//			
//			
//			
//			for (int j =1;j<=numCol;j++) {
//				
//				
//				String value =driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.print(value+ "       ");
//				
//				
//				
//			}
//			
//			System.out.println();
			
			
			
			
			
			
			
			
			
			
		}
	}



package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenAssignment1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String path="C:\\Users\\ahmad\\Desktop\\sikuli\\Registration.xlsx";
		XLUtils.setExcelFile(path, "Sheet1");
		int rowCount= XLUtils.getRowCount(path, "Sheet1");
		for(int i=1; i<=rowCount;i++) {
			
			String fName=XLUtils.getCellData(path, "Sheet1", i, 0);
			String lName=XLUtils.getCellData(path, "Sheet1", i, 1);
			int phnNum=Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 2));
			String eAddress=XLUtils.getCellData(path, "Sheet1", i, 3);
			String address=XLUtils.getCellData(path, "Sheet1", i, 4);
			String city=XLUtils.getCellData(path, "Sheet1", i, 5);
			String st=XLUtils.getCellData(path, "Sheet1", i, 6);
			String pCode=XLUtils.getCellData(path, "Sheet1", i, 7);
			String countryName= XLUtils.getCellData(path, "Sheet1", i, 8);
			String userName=XLUtils.getCellData(path, "Sheet1", i, 9);
			String passWord=XLUtils.getCellData(path, "Sheet1", i, 10);
			
			
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fName);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lName);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(phnNum));
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(eAddress);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(st);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(pCode);
			Thread.sleep(3000);
			
			Select countrySelect=new Select(driver.findElement(By.xpath("//select[@name='country']")));
			countrySelect.selectByVisibleText(countryName);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(passWord);
			driver.findElement(By.xpath("//input[@name='register']")).click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
			
			
			
			
			
		}
	}

}

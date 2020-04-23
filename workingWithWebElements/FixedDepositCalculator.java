package workingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositCalculator {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String path="C:\\Users\\ahmad\\Desktop\\sikuli\\caldata.xlsx";
		
		XLUtils.setExcelFile(path, "Sheet1");
		int rowCount= XLUtils.getRowCount(path, "Sheet1");
		for(int i=1; i<=rowCount;i++) {
			
			int princ=Integer.parseInt(XLUtils.getCellData(path, "Sheet1", i, 0));
			int rateofinterest= Integer.parseInt(XLUtils.getCellData(path,"Sheet1",i, 1));
			int per= Integer.parseInt(XLUtils.getCellData(path,"Sheet1",i, 2));
			String fre=XLUtils.getCellData(path, "Sheet1", i,3);
			double exp_mvalue=Double.parseDouble(XLUtils.getCellData(path,"Sheet1",i,4));
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
			Thread.sleep(3000);
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
			Thread.sleep(3000);
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
			Thread.sleep(3000);
			
			Select perioddrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perioddrp.selectByVisibleText("year(s)");
			Thread.sleep(3000);
			Select frequency=new Select(driver.findElement(By.id("frequency")));
			frequency.selectByVisibleText(fre);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			String act_mvalue=driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			
			if(exp_mvalue==Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
			}
			else
			{
				System.out.println("test failed");
				System.out.println("actual Value is: "+ act_mvalue);
				System.out.println("Expected Value is: "+ exp_mvalue);
			}
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click(); // clear button
			
			Thread.sleep(3000);
		}
	}

}

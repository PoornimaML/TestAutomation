
//script to read data from excel and pass the same data into facebook login page
package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndPassToFB {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fs=new FileInputStream("./Testdata/FaceBookCredentials.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(0);
		XSSFCell cell1=row.getCell(1);
		String val=cell.getStringCellValue();
		String val1=cell1.getStringCellValue();
		System.out.println(val+" "+val1);
		workbook.close();
		fs.close();
		
		
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys(val);
			driver.findElement(By.name("pass")).sendKeys(val1);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			driver.quit();
	}
		

}

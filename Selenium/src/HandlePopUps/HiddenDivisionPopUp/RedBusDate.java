package HandlePopUps.HiddenDivisionPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//REDBUS
//		driver.get("https://www.redbus.in/");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Date']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='21']")).click();
//		Thread.sleep(2000);
		
		
		//DEMOAPP
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hihello");
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

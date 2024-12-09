package FilePopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppFilePopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\Admin\\Pictures\\anti4.jpg");
	}
}

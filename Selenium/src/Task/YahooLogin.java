package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).sendKeys("abhayas_123");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-passwd")).sendKeys("12344321@abh");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
	}
}

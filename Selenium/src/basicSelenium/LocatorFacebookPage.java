package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorFacebookPage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
		Thread.sleep(2000);
	
	driver.findElement(By.name("email")).sendKeys("ABCD@GMAIL.COM");
	driver.findElement(By.id("pass")).sendKeys("1234");
	driver.findElement(By.name("login")).click();
}
}


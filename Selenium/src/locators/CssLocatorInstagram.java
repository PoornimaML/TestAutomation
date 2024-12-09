package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
			Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();
		Thread.sleep(2000);
}
}

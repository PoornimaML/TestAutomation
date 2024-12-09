package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginto_Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
}

}

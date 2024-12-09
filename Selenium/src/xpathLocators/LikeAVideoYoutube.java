package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikeAVideoYoutube {
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(000);
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("yaanji");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[.=\"Yaanji (Instrumental Version)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"I like this\"]")).click();
		driver.quit();
	}
}

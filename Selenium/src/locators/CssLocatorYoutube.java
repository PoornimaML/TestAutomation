package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorYoutube {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
			Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("dia");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("video[class='video-stream html5-main-video']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}

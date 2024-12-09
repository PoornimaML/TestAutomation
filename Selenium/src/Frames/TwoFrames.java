package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\MF.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Poornima");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f1']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9900887766");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f2']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" ML@123");
		Thread.sleep(2000);
		driver.quit();
		
}
}

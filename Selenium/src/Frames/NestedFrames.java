package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\Main1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Poornima");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f3']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Poornima ML");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f2']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" ML");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f1']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" ML@123");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();// main frame
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		//		driver.quit();
		
}
}

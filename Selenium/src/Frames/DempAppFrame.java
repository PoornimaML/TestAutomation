package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DempAppFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl ']"));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("poo@gmail.com");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("poo");
    	driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("poo");
    	driver.switchTo().parentFrame();
    	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(" ML@123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" ML@123");
		Thread.sleep(2000);
		driver.quit();
	}
}

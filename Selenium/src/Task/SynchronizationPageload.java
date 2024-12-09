package Task;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationPageload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		Set<String> aw = driver.getWindowHandles();
		aw.remove(driver.getWindowHandle());
		//String pid = driver.getWindowHandle();
		for (String tw : aw) {
			driver.switchTo().window(tw);
		}
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	}
}

package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class YahooLoginCompose {
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
		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		Set<String> aw = driver.getWindowHandles();
		aw.remove(pid);
		System.out.println(aw.size());
		for (String cw : aw) {
			
			driver.switchTo().window(cw);
		}
		
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("message-to-field")).sendKeys("poorninimaml2710@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Cc   Bcc']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@role='combobox'])[3]")).sendKeys("abhayas_123@yahoo.com");Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys("poornimamlgangadkar@gmail.com");Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("hi hello");Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("hi hello bye");Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Send']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}

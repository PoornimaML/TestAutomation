import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappQspider {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(.,'UI Testing Concepts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("poornima");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Women']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Radio Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Upi']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='tog']")).click();
		Thread.sleep(2000);
		driver.quit();
}
}
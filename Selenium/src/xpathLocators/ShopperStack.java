package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./softwares/edgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://shoppersstack.com");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[.='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/713D1eLsaqL._SX679_.jpg']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='buy now']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abcd");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}

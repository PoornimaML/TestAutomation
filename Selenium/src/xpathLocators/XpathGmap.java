package xpathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGmap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9564672,77.594624,10z?entry=ttu&g_ep=EgoyMDI0MTAxMy4wIKXMDSoASAFQAw%3D%3D");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("mandya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).click();
		//driver.findElement(By.xpath("////button[@aria-label='Search']")).;
		
	}

}

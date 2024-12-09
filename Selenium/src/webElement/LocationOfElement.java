package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).getLocation().getY());
		
}
}

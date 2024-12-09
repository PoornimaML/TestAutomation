package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserNameRefreshUsername {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("password"));
		
		ele.sendKeys("poornima");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.sendKeys("hihello");

}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
			Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc@gail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
	}



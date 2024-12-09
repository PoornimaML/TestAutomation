package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitSynchronization {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains("Log in to Facebook"));
//		WebElement ele = driver.findElement(By.id("email"));
//		wait.until(ExpectedConditions.visibilityOf(ele));
//		ele.sendKeys("abcd");
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/login"));
		 driver.findElement(By.id("email")).sendKeys("abcd");
		 driver.quit();
	}
}

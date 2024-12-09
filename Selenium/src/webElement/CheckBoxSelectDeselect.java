package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectDeselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\CheckBoxSelect.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("a1")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a2")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a3")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a4")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a5")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a6")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.findElement(By.id("a6")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a5")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a4")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a3")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a2")).sendKeys(Keys.SPACE);
		driver.findElement(By.id("a1")).sendKeys(Keys.SPACE);
		driver.quit();
}
}

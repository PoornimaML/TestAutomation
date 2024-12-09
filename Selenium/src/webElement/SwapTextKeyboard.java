package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapTextKeyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\KeyboardFunction.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    driver.findElement(By.id("a1")).sendKeys(Keys.CONTROL+"ax");
	    driver.findElement(By.id("a3")).sendKeys(Keys.CONTROL+"v");
	    driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"ax");
	    driver.findElement(By.id("a1")).sendKeys(Keys.CONTROL+"v");
	    driver.findElement(By.id("a3")).sendKeys(Keys.CONTROL+"ax");
	    driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"v");
	}
}

package actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MaxMinScreen {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
//		Actions act=new Actions(driver);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}

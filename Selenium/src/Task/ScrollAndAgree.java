package Task;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollAndAgree {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();	
		Set<String> aw = driver.getWindowHandles();
		for (String s : aw) {
			driver.switchTo().window(s);
		}
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//input[@type='checkbox']"));
				//driver.findElement(By.xpath("//section[@class='  px-10 py-5 '] "));
		Point p = ele1.getLocation();
		int x=p.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+x+")");
		ele1.click();
		Thread.sleep(2000);
//		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[.='Accept Our Policy']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Admin\\Pictures\\Screenshots.pop.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(2000);
		driver.quit();
}
}

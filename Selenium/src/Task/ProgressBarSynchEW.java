package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarSynchEW {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//button[.='Start']"));
		ele.click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(ele));
		driver.findElement(By.xpath("//button[.='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Start']")).click();
	}
	
}

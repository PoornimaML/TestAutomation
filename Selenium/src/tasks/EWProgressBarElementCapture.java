package tasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EWProgressBarElementCapture {
		public static void main(String[] args) throws InterruptedException, IOException   {
			System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("5");
			 WebElement ele = driver.findElement(By.xpath("//button[.='Start']"));
			 ele.click();
			//Thread.sleep(2000);
			 WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(ele));
				WebElement ele1 = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-[33%] ease-linear transition-all duration-150']"));
				File src = ele1.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\Admin\\Pictures\\Screenshots\\explicitwait.jpeg");
				FileHandler.copy(src, dest);
				driver.quit();

}
}

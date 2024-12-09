package ScreenShort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShort {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;//typecasting
		File src = ts.getScreenshotAs(OutputType.FILE);//get screenshort
		File dest=new File("C:\\Users\\Admin\\Pictures\\Screenshots.tc1.jpeg");//specify the path to store the fine
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

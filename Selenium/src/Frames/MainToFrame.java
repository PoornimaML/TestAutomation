package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainToFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\MainFrame.html");
		driver.findElement(By.xpath("//input[@id='f1']")).sendKeys("Poornima");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);//index
		//driver.switchTo().frame("f2");//id
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='f2']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("PoornimaML");
		

}
}

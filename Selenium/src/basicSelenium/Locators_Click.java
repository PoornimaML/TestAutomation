package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Click {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Admin/Desktop/SELENIUM%20HTML/Locator.html");
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.id("L1")).click();
	//driver.findElement(By.className("C1")).click();
	driver.findElement(By.name("N1")).click();
	driver.quit();
}
}

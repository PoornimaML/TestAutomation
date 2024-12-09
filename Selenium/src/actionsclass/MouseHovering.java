package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

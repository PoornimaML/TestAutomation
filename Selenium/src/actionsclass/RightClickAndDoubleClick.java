package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement ele1 = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		act.doubleClick(ele1).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}

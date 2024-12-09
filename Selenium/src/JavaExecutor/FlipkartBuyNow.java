package JavaExecutor;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBuyNow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.findElement(By.xpath("(//div[@class='tUxRFH'])[1]")).click();
		Set<String> aw = driver.getWindowHandles();
		System.out.println(aw.size());
		ArrayList<String> al=new ArrayList<String>(aw);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(2000);
		driver.quit();
	}
}

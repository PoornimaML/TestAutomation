package JavaExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CLASS {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		Robot r=new Robot();
		act.contextClick(ele).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> AW = driver.getWindowHandles();
		System.out.println(AW.size());
		ArrayList<String> Al=new ArrayList<String>(AW);

		String wh = Al.get(1);
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
//open browser,open maain tab click on new tab, switch to anyone of opened tab selenium browser
//open flipkart scrolldown to buynow click on buynow, switck to buynow page
// open chrome rt click onkannada, open new tab, switch back  to english GET THE URL OF KANNADA BY INDEX

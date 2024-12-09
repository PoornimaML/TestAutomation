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

public class SeleniumDevRandomTabClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[.='About']")).click();Thread.sleep(2000);
		//driver.getWindowHandle();
		WebElement ele1  = driver.findElement(By.xpath("//span[.='Downloads']"));
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3=driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4=driver.findElement(By.xpath("//span[.='Support']"));
		WebElement ele5=driver.findElement(By.xpath("//span[.='Blog']"));
		ArrayList<WebElement> al=new ArrayList<WebElement>();
		al.add(ele1);
		al.add(ele2);
		al.add(ele3);
		al.add(ele4);
		al.add(ele5);
		Robot r=new Robot();
		Actions act=new Actions(driver);
		for (WebElement wh : al) {
			act.contextClick(wh).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);		
		}
		Set<String> aw = driver.getWindowHandles();
		int count=aw.size();
		System.out.println(count);
		ArrayList<String> a=new ArrayList<String>(aw);
		//Switchto all tabs
//		for(int i=0;i<count;i++) {
//			//a.get(count);
//			driver.switchTo().window(a.get(i));
//			Thread.sleep(1000);
//		}
		
		//switch to particular tab
		driver.switchTo().window(a.get(3));
		Thread.sleep(2000);
		
				
		
		driver.quit();
	}

}

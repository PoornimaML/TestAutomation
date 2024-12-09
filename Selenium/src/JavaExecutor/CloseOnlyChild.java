package JavaExecutor;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		String p_id = driver.getWindowHandle();
		Set<String> AW=driver.getWindowHandles();
		System.out.println(AW.size());
//		for (String WH : AW) {
//			driver.switchTo().window(WH);
//			if (WH.equals(p_id)) {
//				continue;
//			}
//			else {
//			driver.close();
//			
//		}
		AW.remove(p_id);
		for (String WH : AW) {
			driver.switchTo().window(WH);
			driver.close();
		}
		Thread.sleep(2000);
		driver.quit();
		
}
	}


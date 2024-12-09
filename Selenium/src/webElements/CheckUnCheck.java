package webElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUnCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\CheckBoxSelect.html");
		Thread.sleep(6000);
		List<WebElement> l=driver.findElements(By.xpath("//input"));
		int count=l.size();
		System.out.println(count);
		for(int i=0; i<count;i++) {
			WebElement e = l.get(i);
			e.click();
		}
		Thread.sleep(2000);
		for (WebElement webElement : l) {
			webElement.click();
		}
//		for (int i = count-1; i >=0; i--) {
//			l.get(i).click();
//			
//		}

}
}

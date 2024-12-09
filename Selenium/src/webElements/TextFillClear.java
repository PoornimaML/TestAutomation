package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFillClear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\CheckBoxSelect.html");
		Thread.sleep(6000);
		List<WebElement> l=driver.findElements(By.xpath("//input"));
		System.out.println( l.size());
//		for (int i = 0; i < l.size(); i++) {
//			WebElement el = l.get(i);
//			el.sendKeys("hi");
//					}
		for(WebElement el:l) {
			el.sendKeys("hi");
		}
		Thread.sleep(2000);
		for (int i = l.size()-1; i >=0; i--) {
			WebElement el = l.get(i);
			el.clear();
}
}
}
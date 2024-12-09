package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfAllLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		for (WebElement w : l) {
			System.out.println(w.getText());
		}
		driver.quit();
	}

}

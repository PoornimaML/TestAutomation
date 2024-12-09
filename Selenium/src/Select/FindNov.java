package Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindNov {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(ele);
		List<WebElement> l=s.getOptions();
		ArrayList<String> a=new ArrayList<String>();
		for (WebElement w : l) {
			String S=w.getText();
			a.add(S);
	}
		for (String string : a) {
			System.out.println(string);
		}
		if(a.contains("Nov")) {
			System.out.println("Nov is present");
		}
		else {
			System.out.println("not present");
		}
		Collections.sort(a);
		for (String string : a) {
			System.out.println(string);
		}Thread.sleep(2000);
		driver.quit();
}
}

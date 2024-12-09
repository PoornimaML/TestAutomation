package Select;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArraylistToTreeset {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		for (WebElement w1:opt) {
			String t = w1.getText();
			l.add(t);
		}
		TreeSet<String> t=new TreeSet<String>(l);
		for (String string : t) {
			System.out.println(string);
		}
	}
}

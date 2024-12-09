package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s=new Select(ele);
		s.selectByIndex(3);
		//MultiSelect
		driver.findElement(By.xpath("//a[.='Multi Select']")).click();
		Thread.sleep(4000);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='select-multiple-native']")));
		s1.selectByIndex(0);
		s1.selectByValue("Winter Coat");
		s1.selectByIndex(3);
		//deselect
		
	}

}
//Ctrl+shft+p---->focus--->rendring
package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\29_JULY\\COREJAVA\\LearnJava\\Select.html");
		WebElement ele=driver.findElement(By.id("nandana"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("a3");
		Thread.sleep(2000);
		s.selectByVisibleText("dum biryani");
		Thread.sleep(2000);
		s.deselectAll();
		if(s.isMultiple()) 
		System.out.println("multiple select");
		else
		System.out.println("single select");
	driver.quit();
		
		
		
	}

}

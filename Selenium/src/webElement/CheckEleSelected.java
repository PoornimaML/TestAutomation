package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEleSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    if(driver.findElement(By.id("domain1")).isSelected()) {
	    	System.out.println("selected");
	    }
	    else {
	    	System.out.println("not selected");
	    }
	    
}
}


package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
    System.out.println(driver.getTitle());
   // System.out.println(driver.getCurrentUrl());
   // System.out.println(driver.getPageSource());
}
}

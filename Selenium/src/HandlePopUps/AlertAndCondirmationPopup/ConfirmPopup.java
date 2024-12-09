package HandlePopUps.AlertAndCondirmationPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}

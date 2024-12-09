package HandlePopUps.AlertAndCondirmationPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUps {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("yes");
		Thread.sleep(4000);
		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KannadaClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
		Thread.sleep(2000);
		

}
}
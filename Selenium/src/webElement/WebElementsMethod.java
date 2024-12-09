package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//section[.='Toggle']")).getLocation());Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//section[.='Toggle']")).getLocation().getX());Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//section[.='Toggle']")).getLocation().getY());Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[.='Already have an account ?']")).getCssValue("margin"));Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//img[@src='/assets/sign-4svuI69N.avif']")).getSize().getHeight());Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//img[@src='/assets/sign-4svuI69N.avif']")).getSize().getWidth());Thread.sleep(3000);
		driver.navigate().to("https://demoapps.qspiders.com/ui/link?sublist=0");Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh(); Thread.sleep(3000);
		driver.navigate().back();Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(200,200));Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(200,400));Thread.sleep(3000);
		driver.quit();
}
	
}

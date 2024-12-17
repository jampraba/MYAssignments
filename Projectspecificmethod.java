package rescheduledec7and8;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Projectspecificmethod {
public ChromeOptions cp;
public ChromeDriver  driver; 
		
@BeforeMethod
		public  void precondition() throws InterruptedException {
			  cp = new ChromeOptions();
			cp.addArguments("--disable-notifications");
			 driver = new ChromeDriver(cp);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://login.salesforce.com");
				WebElement name = driver.findElement(By.xpath("//input[@id='username']"));
				name.sendKeys("dilip@testleaf.com");
				WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
				pass.sendKeys("leaf@2024");
				WebElement log = driver.findElement(By.xpath("//input[@id='Login']"));
				log.click();
				

				
				
				
}
				

}


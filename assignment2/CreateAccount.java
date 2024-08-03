package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createAccountForm']")).click();
		CharSequence generatedString = "Jamunaa";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(generatedString);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("2");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Page title is matched");
		driver.close();
	}
	}

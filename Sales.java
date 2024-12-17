package rescheduledec7and8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Sales extends  Projectspecificmethod  {
@Test
	public void salesforce() throws InterruptedException {
	//- Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//- Click View All 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		//and click Legal Entities from App Launcher
		WebElement legal = driver.findElement(By.xpath("//p[contains(text(),'Legal E')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(legal).perform();
		legal.click();
		Thread.sleep(2000);
		
		//- Click on the Dropdown icon in the legal Entities tab

		WebElement element = driver.findElement(By.xpath("(//span[text()='Legal Entities']//following::a)[1]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//one-app-nav-bar-menu-item[@class='slds-dropdown__item'][1]"));
		element2.click();
		//- Enter Name as 'Salesforce Automation by *Your Name*'
		WebElement name = driver.findElement(By.xpath("(//input[@class='slds-input'])[2]"));
		name.sendKeys("jam");
		Thread.sleep(3000);
	//Enter the Company name as'TestLeaf'.
	WebElement company = driver.findElement(By.xpath("//input[@name='CompanyName']"));
	company.sendKeys("Testleaf");
	//Enter Description as 'Salesforces'.
	WebElement des = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
	des.sendKeys("Salesforce");
	// Select Status as 'Active'
	WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", status);

	status.click();
	driver.findElement(By.xpath("(//span[text()='Active'])[1]")).click();
	Thread.sleep(3000);
	// Click on Save
	WebElement element3 = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
	element3.click();
	System.out.println("Legal entity name : "+ element3.getText());
	// Verify the Alert message (Complete this field) displayed for Name
	//WebElement complete = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));

	//System.out.println("Alert message : "+ complete.getText());





}}
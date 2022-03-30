package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// Duplicatelead
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Daneswari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalapu");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Engineer");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
	
	WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd = new Select (dropdown);
	dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Grow");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sri Durga");
	driver.findElement(By.name("submitButton")).click();
	
	String title2 = driver.getTitle();
	System.out.println(title2);
	
	
	

	}

}

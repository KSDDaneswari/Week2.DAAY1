package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchingbrowser {

	public static void main(String[] args) {
		// Program for login browser and maximize the browser
				
		//setup browser
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url to open
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//maximize the browser
		driver.manage().window().maximize();
		
		//identify username field and enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//identify password field and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//cllick on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Daneswari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalapu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		  WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		  Select dropdown = new Select(findElement);
		  
		  dropdown.selectByVisibleText("New York");
		  
		 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			
		  Select dropdown1 = new Select(source);
		  
		  dropdown1.selectByVisibleText("Employee");
		  
		  
		driver.findElement(By.name("submitButton")).click();
		
		
		// to get the value which we entered for the field
	//	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
	//	System.out.println(text);
		
			
		//get the tile of the aplication
		String title = driver.getTitle();
		System.out.println(title);

	//	driver.close();
				

	}

}

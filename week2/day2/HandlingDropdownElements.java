package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions(); //to disable notifications
		option.addArguments("guest"); // to disable/ignore notifications. only for chrome, other broser can ignore
		//Initialize the WebDriver
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/."); //To load url
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd=driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Yerra");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyTest");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms.");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname");
		//click on source dropdown
		WebElement sourceDD = driver.findElement((By.id("createLeadForm_dataSourceId")));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(4);
		
		WebElement marketingcampaignDD = driver.findElement((By.id("createLeadForm_marketingCampaignId")));
		Select sel1 = new Select(marketingcampaignDD);
		sel1.selectByVisibleText("Automobile");
		
		WebElement ownershipDD = driver.findElement((By.id("createLeadForm_ownershipEnumId")));
		Select sel2 = new Select(ownershipDD);
		sel2.selectByValue("OWN_CCORP");
		 
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle(); 
		System.out.println(Title);
		if (Title.contains("Create")) {
			System.out.println("title verified");
	}
		driver.close();

	}
}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swathi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Yerra");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyTest");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms.");
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle(); 
		System.out.println(Title);
		if (Title.contains("Create")) {
			System.out.println("title verified");
		}
		driver.close();
		}
		

	}


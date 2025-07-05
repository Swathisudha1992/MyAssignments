package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignmentCreateLead {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions(); 
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd=driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyTest");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastname");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms.");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement CompanyName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String AcctName = CompanyName.getText();
		System.out.println("CompanyName");
		if (AcctName.contains("CompanyTest")) {
			System.out.println("Lead created successfully");
		}
		driver.close();

	}

}

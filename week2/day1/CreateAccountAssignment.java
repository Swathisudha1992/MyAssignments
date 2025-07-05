package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CreateAccountAssignment {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions(); 
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd=driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("My Account Name");
		driver.findElement(By.name("officeSiteName")).sendKeys("Leaftaps");
		driver.findElement(By.name("numberEmployees")).sendKeys("20");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.contains("Account Details")) {
			System.out.println("title verified");
		}
		
		
		driver.close();
		
		
		
		
	}

}

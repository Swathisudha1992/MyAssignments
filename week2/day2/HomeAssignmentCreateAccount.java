package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignmentCreateAccount {

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
		driver.findElement(By.className("inputBox")).sendKeys("Account creation one");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industryDD = driver.findElement((By.name("industryEnumId")));
		Select sel = new Select(industryDD);
		sel.selectByIndex(3);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel1 = new Select(ownershipDD);
		sel1.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD = driver.findElement(By.name("dataSourceId"));
		Select sel2 = new Select(sourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketcampaignDD = driver.findElement(By.name("marketingCampaignId"));
		Select sel3 = new Select(marketcampaignDD);
		sel3.selectByIndex(6);
		
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel4 = new Select(stateDD);
		sel4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement AccountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String AcctName = AccountName.getText();
		System.out.println("AccountName");
		if (AcctName.contains("Account creation one")) {
			System.out.println("Account created successfully");
			
		}
		
		driver.close();
		
	}

}

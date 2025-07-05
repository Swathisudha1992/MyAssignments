package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignmentFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Swathi");
		driver.findElement(By.name("lastname")).sendKeys("Yerra");
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByIndex(20);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("sex")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("0129797645");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Swathi@1992");
		
		driver.close();

	}

}

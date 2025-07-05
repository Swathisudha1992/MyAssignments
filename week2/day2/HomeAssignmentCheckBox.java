package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignmentCheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		WebElement ajax = driver.findElement(By.xpath("//span[@class='ui-growl-title']")); //cmd+2 - to assign local variable
		Thread.sleep(3000);
		//boolean displayed = ajax.isDisplayed(); 
		//System.out.println(displayed);
	
		if (ajax.isDisplayed()) { //setTimeout(()=>{debugger},5000);
			System.out.println("Expected result is displayed");
			
		} else {
			System.out.println("Results are not as expected");

		}
		System.out.println(ajax.getText());
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		Thread.sleep(3000);
		WebElement tristate = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p"));
		String state = tristate.getText();
		System.out.println(state);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(3000);
		WebElement toggle = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		if (toggle.isDisplayed()) {
			System.out.println("Expected result is displayed");
			
		} else {
			System.out.println("Results are not as expected");

		}
		System.out.println(toggle.getText());
		WebElement disabled = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']"));
		//boolean enabled = disabled.isEnabled();
		if (!disabled.isEnabled()) {
			System.out.println("Checkbox is disabled");
			
		
		} else {
			System.out.println("Checkbox is not disabled");
		}
			driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
			driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
			WebElement miami = driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']/li[1]"));
			String Countryname = miami.getText();
			System.out.println(Countryname);
			
			driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
			WebElement paris = driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']/li[2]"));
			String Countryname1 = paris.getText();
			System.out.println(Countryname1);
			
			driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[8]")).click();
			WebElement istanbul = driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']/li[3]"));
			String Countryname2 = istanbul.getText();
			System.out.println(Countryname2);
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-close\"]")).click();
            
			driver.close();
	}
	

}
		//if (ajax.isDisplayed()) { //setTimeout(()=>{debugger},5000);
			//System.out.println("Expected result is displayed");
			
		//} else {
			//System.out.println("Results are not as expected");
			
		//}
		//ajax.isEnabled()  //verify if the Checkbox is disabled.
		//if (!ajax.isEnabled()) {
			
		

//	}



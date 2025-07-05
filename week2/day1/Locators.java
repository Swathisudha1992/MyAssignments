package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); //To launch browser
		driver.get("https://www.facebook.com/"); //To load url
		driver.manage().window().maximize();
		String Title = driver.getTitle(); 
		System.out.println(Title); //to print title
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		WebElement  pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}

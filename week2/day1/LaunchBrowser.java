package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); //To launch browser
		driver.get("https://www.facebook.com/"); //To load url
		driver.manage().window().maximize(); //To maximize window
		String Title = driver.getTitle(); //Quick Assist-Assign to local variable
		//to get title 
		System.out.println(Title); //to print title
		driver.close(); //to close current window
		//driver.quit(); to close multiple windows which has opened
		

	}

}

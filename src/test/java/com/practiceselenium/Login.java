
package com.practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	 void getLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		// This is simple code 
		
	}
	public static void main(String[] args) {
		Login obj=new Login();
		obj.getLogin();
		
	}
}
	
	
	      



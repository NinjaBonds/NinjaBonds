package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("Webdriver.chrome.driver.","C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      

		driver.get("https://saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
		
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
		
	
      	
      	
	}

}

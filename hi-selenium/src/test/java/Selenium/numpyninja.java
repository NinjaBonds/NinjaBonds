package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class numpyninja {

	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver.","C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.numpyninja.com/contact");
		
		WebElement frstName = driver.findElement(By.name("first-name"));
		frstName.sendKeys("priyadarshni");
		
		WebElement lastName = driver.findElement(By.name("last-name"));
		lastName.sendKeys("chandan");
		
		WebElement email = driver.findElement(By.id("input_comp-l1c0ku03"));
		email.sendKeys("vijay@bharathi.com");
		
		WebElement phone = driver.findElement(By.id("input_comp-l1c0ku05"));
		phone.sendKeys("9878678676");
		
		WebElement enquiry = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquiry.sendKeys("when next SDET batch will start");
		
		WebElement sendBtn = driver.findElement(By.id("comp-l1c0ku0e3"));
		sendBtn.click();
			
		
		
		
	}
}

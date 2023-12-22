package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class numpyninja_op2 {
	
	public static WebDriver driver;
	static String URL = "https://tutorialsninja.com/demo";
	
    public void dropd() {
	By currencybtn = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
	driver.findElement(currencybtn).click();
		
	WebElement selectele = driver.findElement(By.name("EUR"));
	Select dropdown = new Select(selectele);
	dropdown.selectByVisibleText("€Euro");
	}
	//dropdown.selectByIndex(0); //select 1st option from drop down
	//dropdown.selectByValue("20 to 29"); //select dropdown option with value in the back end as 20 to 29
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(URL);
		
		numpyninja_op2 obj1 = new numpyninja_op2();
		
		obj1.dropd();
	}

}

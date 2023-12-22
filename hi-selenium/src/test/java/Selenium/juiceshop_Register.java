package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Page object model program
public class juiceshop_Register {
		
		public static WebDriver driver;
		String URL = "https://juice-shop.herokuapp.com/#/register";
		
		By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
		By emailID = By.id("emailControl");
		By passwordTxt = By.id("passwordControl");
		By confirmPassword = By.id("repeatPasswordControl");
		By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
		By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
		By secQnAns = By.id("securityAnswerControl");
		
		
		public void register() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(URL);
			driver.findElement(dismissBtn).click();
			
			driver.findElement(emailID).sendKeys("vijay@gmail.com");
			driver.findElement(passwordTxt).sendKeys("bharathi@123");
			driver.findElement(confirmPassword).sendKeys("bharathi@123");
			driver.findElement(secQnBox).click();
			driver.findElement(secQn).click();
			driver.findElement(secQnAns).sendKeys("vijay");
			
		}
		
		public static void main(String[] args) {
			
			juiceshop_Register obj = new juiceshop_Register();
			obj.register();
		}
		

	}





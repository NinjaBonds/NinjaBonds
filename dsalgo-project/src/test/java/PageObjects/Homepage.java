package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Helper;

 public class Homepage extends Helper {
  
    
    
    
	public String URL = "https://dsportalapp.herokuapp.com/";
		static By getstartedbtn = By.xpath("//button[@class='btn']");
	    static By getstarted1 = By.xpath("//a[@href='data-structures-introduction']");
		 static By alert1 = By.xpath("//div[@class='alert alert-primary']");
		static By dsdropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");	
		static By dsdditem = By.xpath("//a[@class='dropdown-item']");
		static By loginbut = By.xpath("//a[@href='/login']");
		static By Registerbut = By.xpath("//a[@href='/register']");
	
               		
		
	    public static void clickgetstartedbtn() {
		   driver.findElement(getstartedbtn).click();	
		}
		
		public static void clickgetstartedbtn1() {
			driver.findElement(getstarted1).click();
			String str = driver.findElement(alert1).getText();
			System.out.println("str:"+str);
			
			System.out.println("The user clicks any of the {string} buttons below the data structures:");
		}
        public static void clickdsdropdown() {
        	driver.findElement(dsdropdown).click();
        	driver.findElement(dsdditem).click();
        	System.out.println("User clicks any dropdown");

        	String Stri = driver.findElement(alert1).getText();
        	System.out.println("str1:"+Stri);
        	driver.manage().window().maximize();
        	
        }
  
        public static void clicksigninlink() throws InterruptedException {
       
        //	WebDriverWait bb = new WebDriverWait(driver, Duration.ofSeconds(3));
        //	wait(TIMEOUT);
        	// System.out.println("loginb:"+wait);
        	driver.findElement(loginbut).click();
        	driver.navigate().to("https://dsportalapp.herokuapp.com/login");
        }
        
        
        public static void clickregisterlink() {
        	driver.findElement(Registerbut).click();
        	driver.navigate().to("https://dsportalapp.herokuapp.com/register");
        }
        }
 
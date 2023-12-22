package PageObjects;
import org.openqa.selenium.By;
import Utilities.Helper;

 public class Loginpage extends Helper {
  
        static By signin = By.xpath("//a[@href='/login']");
        protected static By Username = By.xpath("//*[@id='id_username']");
        protected static By Password = By.xpath("//*[@id='id_password']");
        protected static By loginbutt = By.xpath("//input[@value='Login']");
	    static By Registerbut = By.xpath("/html/body/div[2]/div/div[2]/a");
	    static By signout = By.xpath("//a[@href='/logout']");
	    protected static By loginmsg = By.xpath("/html/body/div[2]");
	    static By errmsgpath = By.xpath("//div[@class='alert alert-primary']");
	//	protected static String username1;
	//	protected static String password1;
	//  private static WebElement username;
	//  private static WebElement password;
        public static void clicksigninlink() throws InterruptedException {
            
            //	WebDriverWait bb = new WebDriverWait(driver, Duration.ofSeconds(3));
            //	wait(TIMEOUT);
            //System.out.println("loginb:"+wait);
            	driver.findElement(signin).click();
            	driver.navigate().to("https://dsportalapp.herokuapp.com/login");
            }
              
        public static void clicksigninbut() {
		   driver.findElement(signin).click();	
		}
        
        public static void clickloginbut() {
 		   driver.findElement(loginbutt).click();	
 		}
        public static void clicksignout() {
        	driver.findElement(signout).click();	
        }
        public static void enterusername(String userName) {
        	driver.findElement(Username).sendKeys(userName);
        }
        public static void enterpassword(String passWord) {
        	driver.findElement(Password).sendKeys(passWord);
        }
        
        public static String clickonusernamerr() {
        	driver.findElement(Username).clear();
            final String hidden = driver.findElement(Username).getAttribute("validationMessage");
            System.out.println(hidden);
        
            return hidden;
        	
        }
        public static String getactualerrormsg() {
            
        	final String errmsg = driver.findElement(errmsgpath).getText();
            return errmsg;
        }
        public static String clickonpasswrdrr() {
        	driver.findElement(Password).clear();
            final String hidd = driver.findElement(Password).getAttribute("validationMessage");
            System.out.println(hidd);
            return hidd;
        	
        }
     
        public static void clickregisterlink() {
        	driver.findElement(Registerbut).click();
        	driver.navigate().to("https://dsportalapp.herokuapp.com/register");
        }
        
         
        }
 
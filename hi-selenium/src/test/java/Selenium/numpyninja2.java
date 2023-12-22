package Selenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class numpyninja2 {

		
		public static WebDriver driver;
		static String URL = "https://tutorialsninja.com/demo";
		
		//*static By currencybtn = By.xpath("//span[text()='Currency']");
		//*static By currencybtn = By.xpath("//*[@id=\"form-currency\"]/div/button");
		static By currencybtn = By.xpath("//button[@class='btn btn-link dropdown-toggle']");
		static By currencyty = By.xpath("//button[text()='€Euro']");
		
		static By camera5d = By.xpath("//img[@alt='Canon EOS 5D']");
		
		static By selectbtn = By.id("input-option226");
		static By option = By.xpath("//select/option/");
		static By homeicon = By.xpath("//i[@class='fa fa-home']");
		static By iphone = By.xpath("//img[@title='iPhone']");
		static By quantity = By.id("input-quantity");
		static By Addtocart = By.id("button-cart");
	    static By message = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");
	    static By carttotal = By.id("cart");
	    static By viewcart = By.xpath("//i[@class='fa fa-shopping-cart']");
	    static By updblock = By.xpath("//div[@class='input-group btn-block']");
	    static By Updquan  = By.xpath("//input[@value='2']");
	    static By Updquann  = By.xpath("//input[@value='3']");
	   // static By ecotax   = By.xpath("//td[@class='text-right']");
	  //  static By ecotax   = By.xpath("//td[@class='text-right']");
	    static By ecotax   = By.xpath("//div[@class=\"col-sm-4 col-sm-offset-8\"]/table/tbody/tr[2]/td");
	    
	    static By ecotaxv   = By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]");
	    static By vattax   = By.xpath("//div[@class=\"col-sm-4 col-sm-offset-8\"]/table/tbody/tr[3]/td");
	    static By vattaxv  = By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]");
	    static By checkout = By.xpath("//a[@class='btn btn-primary']");
	    static By errmess  = By.xpath("//*[@id='checkout-cart']/div[1]");
	    static By refresh  = By.xpath("//i[@class='fa fa-refresh']");
	    static By home     = By.xpath("//i[@class='fa fa-home']");
	    static By Macbook  = By.xpath("//img[@alt='MacBook']");
	    static By Macquan  = By.xpath("//input[@value='1']");
	    static By Addcart  = By.id("button-cart");
	    static By Coupondd = By.xpath("//a[@class='accordion-toggle']");
	    static By coupon = By.id("input-coupon");
	    static By applyc = By.id("button-coupon");
	    static By warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	    static By giftcert = By.xpath("//a[@class='accordion-toggle collapsed']");
	    static By certcoupon = By.id("input-voucher");
	    static By applyco = By.id("button-voucher");
	    static By warningg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	    static By account  = By.xpath("//a[@class='dropdown-toggle']");
	    static By register = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a");
	    public static void register()throws Exception {			
				
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(URL);
			
			driver.findElement(currencybtn).click();
			
			driver.findElement(currencyty).click();
			driver.findElement(camera5d).click();
			
			try {
			    driver.findElement(selectbtn).click();
			    driver.findElement(option);
			    
			}
		
			catch (Exception e) {

				throw new Exception("select option is missing");
			
			}
		}
			public static void registers() throws Exception{
			driver.navigate().to("https://tutorialsninja.com/demo");
			driver.findElement(iphone).click();
			driver.manage().window().maximize();
			driver.findElement(quantity).clear();
			driver.findElement(quantity).sendKeys("2");
			driver.findElement(Addtocart).click();
			Thread.sleep(3000);
			String messages = (driver.findElement(message).getText());
			System.out.println("messages:"+messages);
            driver.findElement(carttotal).click();
            Actions action = new Actions(driver);
            action.scrollByAmount(88,24).perform();
            driver.findElement(viewcart).click();
            Thread.sleep(3000);
            driver.findElement(updblock);
            driver.findElement(Updquan).clear();
            driver.findElement(Updquan).sendKeys("3");
            driver.findElement(refresh).click();
            String eco = (driver.findElement(ecotax).getText());
            String vat = (driver.findElement(vattax).getText());
            String ecov = ((driver.findElement(ecotaxv).getText()));
            String vatv = (driver.findElement(vattaxv).getText());
            
            System.out.println("ecotax:"+eco);
            System.out.println("vat:"+vat);
            System.out.println("ecotaxv:"+ecov);
            System.out.println("vatv:"+vatv);
            driver.findElement(checkout).click();
            String ermess = driver.findElement(errmess).getText();
            
            System.out.println("error is:"+ermess);
            Thread.sleep(3000);
            driver.findElement(updblock);
            driver.findElement(Updquann).clear();
            driver.findElement(refresh).click();
            
            Thread.sleep(3000);
            
            driver.findElement(home).click();
            driver.findElement(Macbook).click();
            
             if((driver.findElement(Macquan)) !=null)
             {
            	 driver.findElement(Addcart).click();
            	 
            	 driver.findElement(carttotal).click();
            	 driver.findElement(viewcart).click();
            	 Thread.sleep(3000);
            	 Actions actionn = new Actions(driver);
            	 actionn.scrollByAmount(648, 18).perform();
            	 driver.findElement(Coupondd).click();
            	 driver.findElement(coupon).sendKeys("ABCD123");
            	 driver.findElement(applyc).click();
            	 Thread.sleep(3000);
            	 String warnings = driver.findElement(warning).getText();
            	
            	 System.out.println("warning:"+warnings);
            	 driver.findElement(giftcert).click();
            	 driver.findElement(certcoupon).sendKeys("AXDFGH123");
            	 driver.findElement(applyco).click();
            
            	 String warnisec = (driver.findElement(warningg)).getText();
            	 System.out.println("warnisec"+warnisec);
            	 driver.findElement(certcoupon).clear();
            	 Thread.sleep(3000);
            	 driver.findElement(giftcert).click();
                 driver.findElement(Coupondd).click();
            	 driver.findElement(coupon).clear();
            	 driver.findElement(Coupondd).click();
            	 driver.findElement(account).click();
            	 driver.findElement(register).click();
             }
             
			}
			
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
	

        try {
		numpyninja2.register();
		
        }catch (Exception e) {
        	e.printStackTrace();
        }
        
        try {
        numpyninja2.registers();
		
        }catch (Exception e) {
        	
        	e.printStackTrace();
        
        	}
        }




}




 package Utilities;

 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
 
 
public class Extentreport {
	public static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";
	public void method() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(URL);
	}
    public static void main(String[] args) {
    	
	
    	ExtentSparkReporter spark = new ExtentSparkReporter("target/extent.html");
    	
    	ExtentReports extent = new ExtentReports();
    	extent.attachReporter(spark);
    	
    	extent.createTest("Ds-algo test ","This is test to validate ds-algo functionality")
    			.log(Status.PASS,"This is logging event for DS-algo test, and it passed");
    	
    	
    }
    }

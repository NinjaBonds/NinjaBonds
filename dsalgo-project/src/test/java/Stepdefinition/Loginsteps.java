package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import PageObjects.Loginpage;
import Utilities.ExcelReader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Loginsteps extends Loginpage {
 
 private String excelFilePath;
 public ExtentTest scenario = null;
 public ExtentReports extent = null;

@Given("User opens sign in page")
public void user_opens_sign_in_pages() {
    // Write code here that turns the phrase above into concrete actions
   
    clicksigninbut();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
	
	extent = new ExtentReports();
	extent.attachReporter(spark);
	
}
@When("user clicks sign in link")
public void user_clicks_sign_in_link() {
    // Write code here that turns the phrase above into concrete actions
   
    clickloginbut();
    
    
	scenario = extent.createTest("Sample Feature Test1");
}		

@Then("It should display an error {string} below Username textbox")
public void it_should_display_an_error_below_Username_textbox(String string) {
  
   
   System.out.println("USername error"+string);
 
   
   clickonusernamerr();
   
   
    scenario.log(Status.PASS,"Test passed successfully");
	scenario.pass("Pass");
	
	scenario.log(Status.FAIL,"Test not passed successfully");
	scenario.pass("Fail");
	
   Assert.assertEquals(string,clickonusernamerr());
}
@When("User enters username and password is blank")
public void User_enters_username_and_password_is_blank(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
   
	List<String> listdata = dataTable.row(0);
	System.out.println(listdata.get(0));

	driver.findElement(Username).sendKeys(listdata.get(0)+"");
}		

@Then("It should display an error {string} below Password textbox")
public void it_should_display_an_error_below_Password_textbox(String string) {
    // Write code here that turns the phrase above into concrete actions

	   clickonpasswrdrr();
	  
		
	   Assert.assertEquals(string,clickonpasswrdrr());
}

@When("User enters invalid username and valid password")
public void User_enters_invalid_username_and_valid_Password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
   
	waitmethod();

	List<String> listdata = dataTable.row(0);
	System.out.println(listdata.get(0));
	
	System.out.println(listdata.get(1));

	driver.findElement(Username).sendKeys(listdata.get(0)+"");
	
   driver.findElement(Password).sendKeys(listdata.get(1)+"");
   clickloginbut();
   
   
}


@Then("System should alert user {string}")
public void it_should_display_an_error_below_password_textbox(String string) {
  
	 scenario.log(Status.PASS,"Test passed successfully");
		scenario.pass("Pass");
		
		scenario.log(Status.FAIL,"Test not passed successfully");
		scenario.pass("Fail");
	
	Assert.assertEquals(string,getactualerrormsg());
	System.out.println(getactualerrormsg());
}

@When("User enters valid username and invalid password")
public void user_enters_valid_username_and_invalid_password1(io.cucumber.datatable.DataTable dataTable) {
	driver.findElement(Password).clear();
	driver.findElement(Username).clear();
	List<String>  listdata = dataTable.row(0);
	System.out.println(listdata.get(0));
	//List<String> str1 = listdata.get(0);
	System.out.println(listdata.get(1));
//	List<String> str2 = listdata.get(1);
	
//	System.out.println(str1);
//	System.out.println(str2);
	driver.findElement(Username).sendKeys(listdata.get(0)+"");
	driver.findElement(Password).sendKeys(listdata.get(1)+"");

    clickloginbut();
}

@Then("System should alert users {string}")
public void system_should_alert_user(String string) {
	
	
	 scenario.log(Status.PASS,"Test passed successfully");
		scenario.pass("Pass");
		
		scenario.log(Status.FAIL,"Test not passed successfully");
		scenario.pass("Fail");
	Assert.assertEquals(getactualerrormsg(),string);
    System.out.println(string);
}


@When("user enters a valid id and valid Password")
public void user_enters_a_valid_id_and_valid_Password(io.cucumber.datatable.DataTable dataTable) {
	driver.findElement(Password).clear();
	driver.findElement(Username).clear();
	List<String> listdata = dataTable.row(0);
	System.out.println(listdata.get(0));
	//List<String> str1 = listdata.get(0);
	System.out.println(listdata.get(1));
	//List<String> str2 = listdata.get(1);
	
	//System.out.println(str1);
//	System.out.println(str2);
	driver.findElement(Username).sendKeys(listdata.get(0)+"");
	driver.findElement(Password).sendKeys(listdata.get(1)+"");
	
    clickloginbut();
}

@Then("user enters homepage")
public void user_enters_homepage() {
 
	System.out.println("User enters homepage");
}
@Given("User is in Homepage after Logged in")
public void user_is_in_homepage_after_logged_in() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is in Homepage after Logged in");
}

@When("User clicks {string}")
public void user_clicks(String string) {
    // Write code here that turns the phrase above into concrete actions
	//clicksignout();
	System.out.println("User clicks signout");   
}


@Then("User enters {string} page")
public void user_enters_page(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("User enters dsalgo page");   
	
}

@Given("The excel file is located at {string}")
public void the_excel_file_is_located_at(String string) {
    
	excelFilePath = string;
	clicksigninbut();   
}

@When("User enters sheetname {string} and rownumber {int}")
public void user_enters_sheetname_and_rownumber_rownumber(String Sheetname,Integer RowNumber) throws Exception {
    
    ExcelReader reader = new ExcelReader();
    
    List<Map<String,String>> testdata = reader.getData(excelFilePath,Sheetname);

   String username = testdata.get(RowNumber).get("username");
    String password = testdata.get(RowNumber).get("password");
   if (username != null || password != null) { 
   Loginpage.enterusername(username);
   Loginpage.enterpassword(password);
   }
}

@When("User clicks on Login button")
public void user_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	 clickloginbut();      
}

@SuppressWarnings("unused")
@Then("It should navigate to homepage with a message {string}")
public void it_should_navigate_to_homepage_with_a_message(String string) {
    
	String str3 = driver.findElement(loginmsg).getText();
	//Assert.assertEquals(string,str3);   
	
}



}
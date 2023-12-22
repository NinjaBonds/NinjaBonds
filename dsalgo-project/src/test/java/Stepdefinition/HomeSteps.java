package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.Homepage;


public class HomeSteps extends Homepage {
 
	
	
@Given("user opens DSalgo page")
public void user_opens_d_salgo_page(){
  
  
  getDriver();   
  openPage(URL); 
 }

 @When("The user clicks the Get started button")
 public void The_user_clicks_the_Get_started_button() {
       
	 clickgetstartedbtn();
 }
 
 @Then("User enter DSalgo Home page")
 public void User_enter_DSalgo_Home_page() {
   System.out.println("User enter DSalgo Home page");
 }
 
 @When("The user clicks Data Structures drop down")
 public void The_user_clicks_Data_Structures_drop_down() {
	 clickdsdropdown();
//	 homepage.clickgetstartedbtn1();
 }

 @Then("The user should see six different data structure entries in that dropdown")
 public void The_user_should_see_six_different_data_structure_entries_in_that_dropdown() {
	 System.out.println("check if 6 entries are there");
 }
 
@When("The user clicks any of the Get Started buttons below the data structures")
 public void The_user_clicks_any_of_the_Get_Started_buttons() throws InterruptedException {
	 clickgetstartedbtn1();
	 waitmethod();
	 clicksigninlink();
	 clickregisterlink();
	 }
 @Then("It should alert the user with a message {string}")
 public String it_should_alert_the_user_with_a_message_you_are_not_logged_in(String string) throws InterruptedException {
     
	 System.out.println("str:"+string);
	 
	 return string;
}
@When("user clicks sign in")
public void user_clicks_sign_in() throws InterruptedException {
Homepage.waitmethod();	
Homepage.clicksigninlink();
}
@Then("The user should be redirected to Sign in page")
public void  The_user_should_be_redirected_to_Sign_in_page() {
	System.out.println("The user should be redirected to Sign in page");
	
}
@When("User clicks Register")
public void User_clicks_Register() {

	Homepage.clickregisterlink();
	
 }

@Then("The user should be directed to Register form")
public void the_user_should_be_directed_to_register_form() {
	System.out.println("The user should be redirected to Register form");
}

}

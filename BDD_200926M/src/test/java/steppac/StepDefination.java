package steppac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	
WebDriver dr; 
@Given("^open browser$")
public void open_browser() throws Throwable {
    dr= new ChromeDriver(); 
    throw new PendingException();
}

@Given("^nevigate to url$")
public void nevigate_to_url() throws Throwable {
    dr.get("http://facebook.com");
    throw new PendingException();
}

@When("^user type userid in usertext box$")
public void user_type_userid_in_usertext_box() throws Throwable {
    dr.findElement(By.id("email")).sendKeys("");
    throw new PendingException();
}

@When("^user type password in password box$")
public void user_type_password_in_password_box() throws Throwable {
    dr.findElement(By.id("pass")).sendKeys("");
    throw new PendingException();
}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
    dr.findElement(By.id("u_0_2")).click();
    throw new PendingException();
}

@Then("^then user should be in his profile$")
public void then_user_should_be_in_his_profile() throws Throwable {
    if (dr.findElement(By.id("signout")).isDisplayed()) {
    	System.out.println("i am in profile page");
    }else 
    	System.out.println("not in profile page");
    throw new PendingException();
}
	
	
    
	
	
}

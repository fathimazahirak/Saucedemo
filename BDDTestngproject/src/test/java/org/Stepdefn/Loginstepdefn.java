package org.Stepdefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefn {
 static WebDriver driver;
 @Test
	@Given("User get to the login page")
	public void user_get_to_the_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to login page")
	public void user_is_navigated_to_login_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0," user_is_navigated_to_login_page");
	}

	//@And("Close the browser")
	//public void close_the_browser() {
	  //  driver.close();
	//}


}

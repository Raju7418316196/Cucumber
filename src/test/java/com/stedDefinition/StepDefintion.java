
package com.stedDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {
	WebDriver driver;
	@Given("user can able to launch the application")
	public void user_can_able_to_launch_the_application() {
		
		 driver = new ChromeDriver();
	}
	@When("user can able to launch  the url")
	public void user_can_able_to_launch_the_url() {
		driver.get("https://www.facebook.com");
	}
	@When("user can enter the username")
	public void user_can_enter_the_username() {
		driver.findElement(By.id("email")).sendKeys("7418316196");
	}
	@When("user can enter the password")
	public void user_can_enter_the_password() {
		driver.findElement(By.name("pass")).sendKeys("Raju7418316196"); 
	}
	@Then("user can succesfully login to fb home page")
	public void user_can_succesfully_login_to_fb_home_page() {
		driver.findElement(By.id("u_0_5_Hh")).click();
		
	}	
	

}

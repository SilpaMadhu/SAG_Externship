package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class SauceDemoStepDefinitions {
	public WebDriver driver;
	
	@Given("User is on SauceDemo Page")
	public void user_is_on_sauce_demo_page() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
	    driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   
	}
	@When("User Login into application with Username and password")
	public void user_login_into_application_with_Username_and_password() throws Throwable {
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	    driver.findElement(By.id("login-button")).click();
	    
	    
	    
	}
	@Then("Products page is populated")
	public void products_page_is_populated() {
	   
		System.out.println("Product page ");
	}

}

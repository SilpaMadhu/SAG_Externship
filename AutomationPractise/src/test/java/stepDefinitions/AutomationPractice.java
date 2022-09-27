package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationPractice {
	public WebDriver driver;
	
	
	@Given("User enter the Url and reaches the YourLogo page")
	public void user_enter_the_url_and_reaches_the_your_logo_page() {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get( "http://automationpractice.com/index.php");
	   
	}
	@When("User clicks the contactUs button")
	public void user_clicks_the_contact_us_button() {
		//driver.findElement(By.id("contact-link")).click();
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click();
		
		
	}
	@Then("Enter the details and attach a file")
	public void enter_the_details_and_attach_a_file() {
		//Select heading = new Select(driver.findElement(By.id("id_contact")));
		Select heading = new Select(driver.findElement(By.xpath("//select[@id='id_contact']")));
		heading.selectByIndex(1);
		
		//driver.findElement(By.id("email")).sendKeys("silpam@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("silpam@gmail.com");
		//driver.findElement(By.id("id_order")).sendKeys("silpa");
		driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("silpa");
		
		WebElement uploadfile=driver.findElement(By.id("fileUpload"));
		uploadfile.sendKeys("E:\\Software AG\\task by mentor.txt");
		
		//driver.findElement(By.id("message")).sendKeys("Purchase succesfull");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Purchase succesfull");
		
	    
	}
	@Then("Send the message")
	public void send_the_message() {
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"
)).click();
	    
	}

}

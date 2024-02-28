package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.*;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
	WebDriver driver;
	@Given("User navigates to application")
	public void user_navigates_to_application() throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}
	@When("User enters valid user name and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys(("admin123"));
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("System is logged into application")
	public void system_is_logged_into_application() {
	    String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	      
	    String actualResult=driver.getCurrentUrl();
		 SoftAssert softAssert = new SoftAssert();
		 softAssert.assertEquals(actualResult, expectedResult);
		 softAssert.assertAll();//
	    
	}
	
}

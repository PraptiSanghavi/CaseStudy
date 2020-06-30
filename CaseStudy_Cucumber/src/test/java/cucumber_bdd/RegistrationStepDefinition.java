package cucumber_bdd;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinition 
{
	WebDriver driver;

	public RegistrationStepDefinition() 
	{
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Given("The URL of TestMeApp portal is {string}")
	public void the_url_of_test_me_app_portal_is(String url) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("User clicks on SignUp link {string}")
	public void user_clicks_on_sign_up_link(String string) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("User enters Username {string} for registration")
	public void user_enters_username_for_registration(String username) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(username);
	}

	@When("User enters First Name {string} for registration")
	public void user_enters_first_name_for_registration(String firstname) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	}

	@When("User enters Last Name {string} for registration")
	public void user_enters_last_name_for_registration(String lastname) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@When("User enters Password {string} for registration")
	public void user_enters_password_for_registration(String password) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User re-enters password {string} for registration")
	public void user_re_enters_password_for_registration(String confirmpass) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys(confirmpass);
	}

	@When("User clicks Gender {string} radio button for registration")
	public void user_clicks_gender_radio_button_for_registration(String gender) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[contains(.,'Male')]")).click();
	}

	@When("User enters Email {string} for registration")
	public void user_enters_email_for_registration(String email) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}

	@When("User enters Mobile Number {string} for registration")
	public void user_enters_mobile_number_for_registration(String number) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys(number);
	}

	@When("User enters Date of Birth {string} for registration")
	public void user_enters_date_of_birth_for_registration(String dob) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dob);
	}

	@When("User enters Address {string} for registration")
	public void user_enters_address_for_registration(String address) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys(address);
	}
	
	@When("User selects Security Question {string} for registration")
	public void user_selects_security_question_for_registration(String question) 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("securityQuestion")).sendKeys(question);
	}

	@When("User enters Answer {string} for security question for registration")
	public void user_enters_answer_for_security_question_for_registration(String answer) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(answer);
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	}

	@Then("User is directed to TestMeApp Login Page")
	public void user_is_directed_to_test_me_app_login_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    String actual = "Login";
	    String expected = driver.findElement(By.xpath("//title[contains(.,'Login')]")).getText();
	    
	    Assert.assertEquals(expected, actual);
	    System.out.println("TEST CASE 1 - PASSED");
	}
}

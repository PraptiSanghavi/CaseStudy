package cucumber_bdd;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition 
{
	WebDriver driver;

	public LoginStepDefinition() 
	{
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User clicks on SignIn link {string}")
	public void user_clicks_on_sign_in_link(String url) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("User provides valid Username {string} and Password {string} as credentials")
	public void user_provides_valid_username_and_password_as_credentials(String username, String password) 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() 
	{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	}

	@Then("User is able to see SignOut link")
	public void user_is_able_to_see_sign_out_link() 
	{
		// Write code here that turns the phrase above into concrete actions
		boolean linkName = driver.findElement(By.xpath("//a[@href='logout.htm']")).isDisplayed();
		Assert.assertTrue(linkName);
		System.out.println("TEST CASE 2 - PASSED");

	}

}

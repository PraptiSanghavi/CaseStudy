package cucumber_bdd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEngineStepDefinition 
{
	WebDriver driver;
	String actual, expected;
	
	public SearchEngineStepDefinition() 
	{
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("User is on the HomePage")
	public void user_is_on_the_home_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("userName"))));
	    
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
	}

	@When("User searchs for {string}")
	public void user_searchs_for(String product) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("products")).sendKeys(product);
	}

	@When("User clicks on Find Details button")
	public void user_clicks_on_find_details_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User should be on product page")
	public void user_should_be_on_product_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    expected = "Search";
	    
	    String URL = driver.getCurrentUrl();
	    if(URL.contains(expected))
	    {
	    	System.out.println("TEST CASE 3 - PASSED");
	    }
	}

}

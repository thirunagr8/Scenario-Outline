package scenarioOutlineSteps;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("When user given with the Guru{int} Page")
	public void when_user_given_with_the_Guru_Page(Integer int1) {
		System.setProperty("webdriver.chrome.driver", "E:\\GANGA\\06062018\\scenarioOutline\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver.get("http://demo.guru99.com/telecom/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS); 
	}

	@Given("When clicks on Add customer button")
	public void when_clicks_on_Add_customer_button() {
		driver.findElement(By.xpath("(//a[@href=\"addcustomer.php\"])[1]")).click();
		driver.findElement(By.id("done"));
	}

	@When("User Enters all the mandatory fields {string},{string},{string},{string},{string}")
	public void user_Enters_all_the_mandatory_fields(String fname, String lname,String mailId, String address, String phoneno) {
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mailId);
		driver.findElement(By.xpath("//textarea[@placeholder=\"Enter your address\"]")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(phoneno);
	}

	@When("When user clicks on submit button")
	public void when_user_clicks_on_submit_button() {
		driver.findElement(By.name("submit")).click();  
	}

	@Then("User should be able to see Atleast four times the Browser should launch")
	public void user_should_be_able_to_see_Atleast_four_times_the_Browser_should_launch() {

		WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));

		Assert.assertTrue(customerId.isDisplayed());

	}	
}

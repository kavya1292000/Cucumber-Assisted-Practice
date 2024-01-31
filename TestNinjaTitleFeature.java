package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNinjaTitleFeature {
WebDriver driver;
	
	@Given("User is on Chrome browser")
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@When("User is on Chrome browser users enters the URL")
	public void EnterURL()
	{
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Then("User gets title of the page")
	public void testpageTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@And("user closes the browser")
	public void teardown()
	{
		driver.close();
	}


}

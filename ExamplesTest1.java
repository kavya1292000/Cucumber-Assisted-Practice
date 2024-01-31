package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ExamplesTest1 {


	@Given("User is on the MainPage,get title of the page")
	public void user_is_on_the_main_page_get_title_of_the_page() {
		
		String title = BaseHooks.driver.getTitle();
		
		System.out.println(title);
	  
	}
	@When("User will enter {string},{string}")
	public void user_will_enter_username_password(String user, String passwd) throws InterruptedException {
		
		WebElement e1 = BaseHooks.driver.findElement(By.xpath("//input[@id='wpName2']"));
		
		WebElement e2 = BaseHooks.driver.findElement(By.xpath("//input[@id='wpPassword2']"));
		
		e1.clear();
		e1.sendKeys(user);
		
		e2.clear();
		e2.sendKeys(passwd);
		
		Thread.sleep(2000);
	}
	@Then("User will enter {string} and {string}")
	public void user_will_enter_emial_id_retype_password(String re, String em) throws InterruptedException {
	  
		WebElement e3 = BaseHooks.driver.findElement(By.xpath("//input[@id='wpRetype']"));
		
		WebElement e4 = BaseHooks.driver.findElement(By.xpath("//input[@id='wpEmail']"));
		
		e3.clear();
		e3.sendKeys(re);
		
		
		e4.clear();
		e4.sendKeys(em);
		
		
		Thread.sleep(2000);
		
	   
	}
	@Then("user will click on Create account button")
	public void user_will_click_on_create_account_button() {
		
		WebElement e5 = BaseHooks.driver.findElement(By.xpath("//button[@id='wpCreateaccount']"));
		e5.click();
	  
	}


}

package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ExamplesTest2 {


	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
		
		WebElement loginLink = BaseHooks.driver.findElement(By.xpath("//a[@data-mw='interface']//span[contains(text(),'Log in')]"));
		loginLink.click();
	  
	}
	@When("User will enter login {string},{string}")
	public void user_will_enter_username_and_password(String user1, String pass1) {
		
		
	WebElement usrname = BaseHooks.driver.findElement(By.xpath("//input[@id='wpName1']"));
		
		WebElement passwd = BaseHooks.driver.findElement(By.xpath("//input[@id='wpPassword1']"));
		
		usrname.sendKeys(user1);
		passwd.sendKeys(pass1);
		
	 
	}
	@Then("User will click login button")
	public void user_will_click_login_button() {
		
		WebElement loginbtn = BaseHooks.driver.findElement(By.xpath("//button[@id='wpLoginAttempt']"));
		loginbtn.click();
	  
	}


}

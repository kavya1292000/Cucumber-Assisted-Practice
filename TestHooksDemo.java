package steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class TestHooksDemo {
	@Before(value="@regression")
	public void init()
	{
	System.out.println("test execution started");
	System.out.println("DB connection started");
		
	}
	@After(value="@regression")
	public void dbclose()
	{
	System.out.println("test execution completed");
	System.out.println("DB connection closed");
		
	}


}

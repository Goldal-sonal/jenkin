package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class SampleFile{
	public static WebDriver driver;
@Given("^Open Logic Invoice Application$")
public void open_Logic_Invoice_Application() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver = new ChromeDriver();
	String baseUrl = "http://localhost/LogicInvoice/upload/admin/index.php";
	driver.get(baseUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^I enter username \"(.*?)\" and password \"(.*?)\" for Logic Invoice$")
public void i_enter_username_and_password_for_Logic_Invoice(String username, String password) throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(username);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys(password);
}

@Then("^User should be login successfully in Logic Invoice$")
public void user_should_be_login_successfully_in_Logic_Invoice() throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
}

@Then("^Browser Closed$")
public void browser_Closed() throws Throwable {
   driver.close();
}

@Given("^Open POS Application$")
public void open_POS_Application() throws Throwable {
	driver.get("http://localhost/POS/public/home");
  
}

@When("^I enter username \"(.*?)\" and password \"(.*?)\" for POS$")
public void i_enter_username_and_password_for_POS(String arg1, String arg2) throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(arg1);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/div[2]/input[1]")).sendKeys(arg2);
	
   
}

@Then("^User should be login successfully in POS$")
public void user_should_be_login_successfully_in_POS() throws Throwable {
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).click();
	
	
   
}


}

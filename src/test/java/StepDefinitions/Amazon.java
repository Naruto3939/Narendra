package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {

	static WebDriver driver;
	@Given("open the chrome1 {string}")
	public void open_the_chrome1(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	  
	}

	@When("enter username and password {string} and {string}")
	public void enter_username_and_password_and(String string, String string2) {
		  driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(string);
		  driver.findElement(By.xpath(" //input[@class='a-button-input']")).click();
		  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(string2);
		  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		  
	}
	@When("enter username and password1")
	public void enter_username_and_password1(DataTable dataTable)
	{
		List<List<String>> val=dataTable.cells() ;
		System.out.println(val.get(0).get(0)+"-"+val.get(0).get(1));       //to call the value
		System.out.println(val.get(1).get(0) +"-"+ val.get(1).get(1));
	}

	@Then("it should land on the login page1")
	public void it_should_land_on_the_login_page1() {
	    System.out.println("hi");
	    driver.quit();
	  
	}

}

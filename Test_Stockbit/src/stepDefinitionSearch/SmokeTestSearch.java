package stepDefinitionSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTestSearch {

	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockbit.com/#/login");  
	}

	@When("^User enter valid username and valid password$")
	public void User_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("crismon");
		driver.findElement(By.id("password")).sendKeys("crismon123");
	    Thread.sleep(1000);	    
	}

	@Then("^User can login succesfully$")
	public void User_can_login_succesfully() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	    Thread.sleep(2000);	
	}

	@Then("^User input words to search$")
	public void User_input_words_to_search() throws Throwable {
		if(driver.findElement(By.xpath("//div[@class=\"ant-modal-footer\"]//button[@class=\"ant-btn skip-btn ant-btn-lg\"]")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class=\"ant-modal-footer\"]//button[@class=\"ant-btn skip-btn ant-btn-lg\"]")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"header-search\"]/div/div[2]/input")).sendKeys("BBCA");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"header-search\"]/div/div[2]/input")).sendKeys(Keys.ENTER);
		
	}

}

package ebayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItems {
	
	WebDriver driver;
	
	@Given("home page should be open in the browser")
	public void home_page_should_be_open_in_the_browser() {
		 	driver = new ChromeDriver();
	        driver.get("https://www.ebay.com");
	        driver.manage().window().maximize();
	}

	@When("click on the search button and enter values")
	public void click_on_the_search_button_and_enter_values() {
		WebElement search=driver.findElement(By.id("gh-ac"));
		  search.sendKeys("Watch");
		  search.sendKeys(Keys.ENTER);
		  
		  search = driver.findElement(By.id("gh-ac"));
		  search.clear();
		  search.sendKeys("Watches under 5000");
		  search.sendKeys(Keys.ENTER);
	}

	@Then("successful searches")
	public void successful_searches() {
	    System.out.println("Successfull searches done");
	    driver.quit();
	}
}

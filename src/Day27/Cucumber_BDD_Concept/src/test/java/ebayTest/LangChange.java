package ebayTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LangChange {  
	WebDriver driver;
	@Given("home page of amazon should be open in the browser")
	public void home_page_of_amazon_should_be_open_in_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); // TestCase - 9
	}

	@When("click on the language button and click enter")
	public void click_on_the_language_button_and_click_enter() {
	    driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/button")).sendKeys(Keys.ENTER);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/ul/li[4]/a/span/span[1]")).click();
	}

	@Then("successfully changed language")
	public void successfully_changed_language() {
	    
	}

}

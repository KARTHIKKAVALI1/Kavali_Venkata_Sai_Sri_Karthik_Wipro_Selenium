package ebayTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCart {

	WebDriver driver;
	@Given("the product page should be open in the browser")
	public void the_product_page_should_be_open_in_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		 WebElement search=driver.findElement(By.id("userid"));
		  search.sendKeys("saikarthik573@gmail.com");
		  search.sendKeys(Keys.ENTER);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  WebElement search1=driver.findElement(By.id("pass"));
		  search1.sendKeys("Kavali9@");
		  search1.sendKeys(Keys.ENTER);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("click on the add to cart button and click enter")
	public void click_on_the_add_to_cart_button_and_click_enter() {
		driver.get("https://www.ebay.com/itm/386230990003");
		driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]")).sendKeys(Keys.ENTER);
	}

	@Then("added to the cart successfully")
	public void added_to_the_cart_successfully() {
	    System.out.println("Added to Cart Successfully");
	}
}

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

public class DeleteCart {
	
	WebDriver driver;
	
	@Given("cart page should be open in the browser")
	public void cart_page_should_be_open_in_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		 WebElement search=driver.findElement(By.id("userid"));
		  search.sendKeys("saikarthik573@gmail.com");
		  search.sendKeys(Keys.ENTER);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  WebElement search1=driver.findElement(By.id("pass"));
		  search1.sendKeys("Kavali9@");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  search1.sendKeys(Keys.ENTER);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("click on the remove button and click enter")
	public void click_on_the_remove_button_and_click_enter(){
		driver.findElement(By.xpath("//a[contains(@href,'cart.ebay.com')]")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[1]/div[1]/div/ul/li/div/div/div/div[2]/span[2]/button")).click();
	}

	@Then("deleted from the cart successfully")
	public void deleted_from_the_cart_successfully() {
	    System.out.println("Deleted from the cart successfully");
	}

}

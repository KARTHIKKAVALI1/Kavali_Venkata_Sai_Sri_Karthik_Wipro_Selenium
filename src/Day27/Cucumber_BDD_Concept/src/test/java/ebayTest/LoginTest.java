package ebayTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginTest {
    WebDriver driver;

    @Given("login page should be open in the default browser")
    public void login_page_should_be_open_in_default_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn");
    }

    @When("^click on the username and enter (.*)$")
    public void click_on_the_username_and_enter_email(String email) {
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys(email);
    }

    @And("click on continue button")
    public void click_on_continue_button() {
        driver.findElement(By.id("signin-continue-btn")).click();
    }

    @And("^add (.*)$")
    public void add_password1(String password) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @And("^click on signin button check (.*)$")
    public void click_on_signin_button_check_status(String status) {
        driver.findElement(By.id("sgnBt")).click();

        if (status.equalsIgnoreCase("success")) {
            if (driver.getCurrentUrl().contains("myebay")) {
                System.out.println("success");
            } else {
                System.out.println("failed");
            }
        } else if (status.equalsIgnoreCase("failed")) {
            if (driver.getPageSource().toLowerCase().contains("incorrect") || 
                driver.getPageSource().toLowerCase().contains("not match")) {
                System.out.println("failed");
            } else {
                System.out.println("success");
            }
        }

    }

    @Then("login successfully and then open home page")
    public void login_successfully_and_open_home_page() {
        driver.quit();
    }
}

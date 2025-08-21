package ebayTest;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class SearchSteps {

    WebDriver driver;

    @Given("now list of items to search")
    public void list_of_items_to_search() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
    }

    @When("now click on the search feild")
    public void click_on_the_search_field() {
		driver.findElement(By.id("gh-ac")).sendKeys(Keys.ENTER);
    }

    @And("now enter multiple categories of data")
    public void enter_multiple_categories_of_data() {
    	ArrayList<Integer> linkIndexes = new ArrayList<>();
	    for (int i = 1; i <= 18; i++) { 
	        linkIndexes.add(i);
	    }
	    for (int index : linkIndexes) {
	        WebElement link = driver.findElement(
	            By.xpath("//*[@id='wrapper']/div[1]/div/div/div[2]/div[1]/ul/li[" + index + "]/a")
	        );
	        link.sendKeys(Keys.ENTER); 
	    }
    }

    @Then("now conform it is working as expected")
    public void conform_it_is_working_as_expected() {

        boolean results = driver.getPageSource().contains("Results");
        if(results) {
            System.out.println("Multiple searches worked as expected.");
        } else {
            System.out.println("There is problem in searching");
        }
        driver.quit();
    }
}


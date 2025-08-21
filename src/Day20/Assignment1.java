package newCon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {
	
//	Assignment 1 – Action Class
//
//	Objective: Practice mouse and keyboard interactions.
//
//	Scenario:
//
//	Open the DemoQA site → https://demoqa.com/buttons
//
//	Perform:
//
//	Double Click on “Double Click Me” button.
//
//	Right Click on “Right Click Me” button.
//
//	Single Click on the third “Click Me” button.
//
//	Print the text messages that appear after each click action.
//
//	Extra Challenge:
//
//	Visit https://demoqa.com/dragabble and drag the element from its position to another point.

    WebDriver driver;
    Actions actions;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        actions = new Actions(driver); 
    }

    @Test
    public void mouseKeyboardActions() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        
        WebElement dblClkBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(dblClkBtn).perform();
        String dblclkmsg = driver.findElement(By.id("doubleClickMessage")).getText();
        System.out.println("Double Click Message: " + dblclkmsg);
        
        Thread.sleep(4000);
        
        WebElement rClBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rClBtn).perform();
        String rClmsg = driver.findElement(By.id("rightClickMessage")).getText();
        System.out.println("Right Click Message: " + rClmsg);
        
        Thread.sleep(4000);
        
        WebElement clkmebtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clkmebtn).perform();
        String sclmsg = driver.findElement(By.id("dynamicClickMessage")).getText();
        System.out.println("Single Click Message: " + sclmsg);
    }

    @Test
    public void dragElement() throws InterruptedException {
        driver.get("https://demoqa.com/dragabble");
        WebElement dragBox = driver.findElement(By.id("dragBox"));
        Thread.sleep(4000);
        actions.dragAndDropBy(dragBox, 180, 40).perform();
        System.out.println("Dragged successfully.");
        Thread.sleep(4000);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Successfull Done");
        }
    }
}

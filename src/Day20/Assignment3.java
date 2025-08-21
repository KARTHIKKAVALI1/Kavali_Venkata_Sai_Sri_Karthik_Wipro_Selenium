package newCon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class Assignment3 {
	
//	Assignment 3 – Alerts
//
//	Objective: Handle different types of alerts.
//
//	Scenario:
//
//	Open the DemoQA site → https://demoqa.com/alerts
//
//	Perform:
//
//	Click the button to see an alert, accept it.
//
//	Click the “On button click, confirm box will appear” button, dismiss the alert.
//
//	Click the “Prompt Box” button, enter your name, and accept it.
//
//	Capture and print the alert messages before accepting/dismissing.

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void handleAlerts() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Message: " + simpleAlert.getText());
        simpleAlert.accept();
        Thread.sleep(4000);
        driver.findElement(By.id("confirmButton")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Message: " + confirmAlert.getText());
        confirmAlert.dismiss();  
        Thread.sleep(4000);
        driver.findElement(By.id("promtButton")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt Alert Message: " + promptAlert.getText());
        promptAlert.sendKeys("Narasimha");
        promptAlert.accept();
        Thread.sleep(4000);
        String result = driver.findElement(By.id("promptResult")).getText();
        System.out.println("Prompt Result on Page: " + result);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(4000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());  // wait dynamically
        Thread.sleep(4000);
        Alert timedAlert = driver.switchTo().alert();
        System.out.println("Timed Alert Message: " + timedAlert.getText());
        timedAlert.accept();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

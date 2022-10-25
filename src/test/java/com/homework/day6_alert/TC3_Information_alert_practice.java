package com.homework.day6_alert;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3_Information_alert_practice {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        // 1. Set up browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }

        @Test
        public void alertCheck(){
        //Click to "Click for JS Confirm" button

            WebElement clickJSBtn = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

            clickJSBtn.click();

            //send "hello" text to alert
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("hello");
            alert.accept();

            //verify "You entered:hello" text is displayed
            WebElement actualResult = driver.findElement(By.xpath("//p[.='You entered: hello']"));
            String getActualResult = actualResult.getText();

            String expectedResult = "You entered: hello";
            Assert.assertEquals(getActualResult,expectedResult);




        }

}

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

public class TC2_Confirmation_Alert_Practice {


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

        WebElement clickJSBtn = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        clickJSBtn.click();

        //Click to OK button from the alert

        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Verify  "You clicked: Ok" text is displayed

        WebElement verify = driver.findElement(By.id("result"));
        String actualTextMessage = verify.getText();
        String expectedtextMessage= "You clicked: Ok";

        Assert.assertEquals(actualTextMessage,expectedtextMessage);


    }
}
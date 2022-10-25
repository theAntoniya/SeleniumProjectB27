package com.homework.day7;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyAndPrintLinks {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. Set up  Browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    //go to https://www.openxcell.com
    public void countNumberOfLinks () {
        driver.get("https://www.openxcell.com");

        //count the number of the links on the page
        //expected:332

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //Print the number of the links on the page
        System.out.println("allLinks.size() = " + allLinks.size());

        //Verify expected number of the links

       String actualNumberOfLinks = String.valueOf(allLinks.size());
       String expectedNumberOfLinks = "332";

        Assert.assertEquals(actualNumberOfLinks,expectedNumberOfLinks,"Number does not match");



    }
}

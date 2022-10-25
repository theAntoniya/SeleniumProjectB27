package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_SimpleDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        //1.Set up browser
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void simpleDropdown() {


//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));


        String actualSimpledropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdown = "Please select an option";

        Assert.assertEquals(actualSimpledropdown, expectedSimpleDropdown);


//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdown = stateDropdown.getFirstSelectedOption().getText();

        String expectedStateDropdown = "Select a State";

        Assert.assertEquals(actualStateDropdown,expectedStateDropdown);

    }

        @AfterMethod
        public void tearDownMethod(){
            driver.quit();
        }

    }


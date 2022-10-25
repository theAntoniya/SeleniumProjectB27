package com.homework.day7;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Count_Numbers_Of_Link_With_No_Text {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    //go to https://www.openxcell.com
    public void printTextOfLinks(){
        driver.get("https://www.openxcell.com");

        //count the number of links that does not have text and verify


        List<WebElement> allLinks = driver.findElements((By.tagName("a")));




        for (WebElement eachLink: allLinks){

            if (eachLink.getText().isEmpty()) {

                System.out.println(eachLink);
            }


        //    System.out.println("allLinks.size() = " + allLinks.size());


    }}}

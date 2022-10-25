package com.homework.day7;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Print_Text_Of_Link {

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

            //print out the texts of the links on the page

            List<WebElement> allLinks = driver.findElements((By.tagName("a"))); //locate all the links on a page

            for(WebElement eachLink : allLinks){
                System.out.println("Text of each link: " + eachLink.getText());

        }

    }
}
package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {

    public static void main(String[] args) {

        /*
        1. Open Chrome browser
        2. Go to https://www.cydeo.com/
        3. Verify title:
        Expected: Cydeo
        */


        //1.set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //making window full screen/maximizing
        driver.manage().window().maximize();

        // Go to https://www.cydeo.com/
        driver.get("https://www.cydeo.com/");

        //Verify title Expected: Cydeo
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAILED!");
        }

        driver.quit();

    }
}

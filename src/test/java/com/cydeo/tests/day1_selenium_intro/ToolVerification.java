package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolVerification {

    public static void main(String[] args) {

        //1.set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();

        //making window full screen/maximizing
        driver.manage().window().maximize();



        //navigate().to() method os loading to url in browser.
        driver.navigate().to("https://practice.cydeo.com");
        String expectedTitle = "Practice";
        String currentTitle = driver.getTitle();
        if (currentTitle.equals(expectedTitle)){
            System.out.println("Practice");
        }else {
            System.out.println("Title verification is FAILED!");
        }

        String expectedUrl = "Cydeo";
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Cydeo");
        }else {
            System.out.println("Url verification is FAILED!");
        }

    }
}

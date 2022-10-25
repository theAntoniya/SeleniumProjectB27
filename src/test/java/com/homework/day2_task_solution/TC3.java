package com.homework.day2_task_solution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

    public static void main(String[] args) {

        //Back and forth navigation
        //1.Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://google.com

        driver.get(" https://google.com");

        //3.Click to Gmail from top right
        WebElement clickBtn = driver.findElement(By.tagName("a"));
        clickBtn.click();

        //4.Verify title contains:
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

        //5.Go back to Google by using the.back();

        driver.navigate().back();

        //6.Verify title equals :
        //Expected: Google

        expectedInTitle = "Google";
        actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verified!");
        }else{
            System.out.println("Title is not verified!");
        }
    }
}

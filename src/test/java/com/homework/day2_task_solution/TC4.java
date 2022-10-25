package com.homework.day2_task_solution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
    public static void main(String[] args) {

        //Practice Cydeo -Class locator practice

        //1.Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to https://Practice.cydeo.com/inputs

        driver.get("https://Practice.cydeo.com/inputs");

       //3.Click to "Home" link
        WebElement clickBtn = driver.findElement(By.className("nav-link"));
        clickBtn.click();

        //4.Verify title is as expected:
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected!");
        }else{
            System.out.println("Title verification failed!");
        }

    }
}

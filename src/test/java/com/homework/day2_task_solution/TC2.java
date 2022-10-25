package com.homework.day2_task_solution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

    public static void main(String[] args) {

        //Zero Bank header verification

        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");

        //3.Verify header text
        //Expected: "Log in to XeroBank"

        String expectedHeader = "Log in to ZeroBank";
        WebElement getHeader = driver.findElement(By.tagName("h3"));
        String actualHeader = getHeader.getText();


        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header text verification passed!");
        }else{
            System.out.println("Header text verification failed!");
        }

    }
}

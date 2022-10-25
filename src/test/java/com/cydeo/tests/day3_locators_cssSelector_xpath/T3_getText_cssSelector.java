package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getText_cssSelector {

    public static void main(String[] args) {

        //1-Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


       // 2- Go to: https://login1.nextbasecrm.com/
       driver.get("https://login1.nextbasecrm.com/");


        // 3- Verify “Log in” button text is as expected:
       // Expected: Log In

        //Locate with using cssSelector by type attribute:
        WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit']"));

        // Locate with using cssSelectore by value attribute:
      //  WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locate with using cssSelector by class attribute: with sSyntax #2:
        //WebElement loginBtn = driver.findElement(By.cssSelector("input.login-btn");

        //Locate with using cssSelector by onclick attribute
       // WebElement loginBtn = driver.findElement(By.cssSelector("input[onclick=\" BX.addClass(this, 'wait');\"]"));

        //Locate with using cssSelector by class attribute:
        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLoginBtnText = "Log In";
        String  actualLogInBtnText = loginBtn.getAttribute("value");

        if (actualLogInBtnText.equals(expectedLoginBtnText)){
            System.out.println("Login text verification passed!");
        }else{
            System.out.println("Login text verification failed!");
        }
        driver.quit();

    }

}

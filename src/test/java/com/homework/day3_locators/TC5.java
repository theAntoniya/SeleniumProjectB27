package com.homework.day3_locators;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5 {

    public static void main(String[] args) {
        // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

       // 3- Enter incorrect username into login box:
        WebElement inputUserName = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        inputUserName.sendKeys("incorrect");


//        5- Click to Reset password button.
        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button.login-btn"));
        resetPasswordBtn.click();


       // 6- Verify error message text is as expected:
     // Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Login or E-mail not found";
        String actualErrorMessage = errorMessage.getText();

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification passed!");
        }else{
            System.out.println("Error message verification failed!");
        }
        driver.quit();




    }
}

package com.homework.day4_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement Btn6 = driver.findElement(By.xpath("//button[@onclick='button6()']"));

        Btn6.click();

        String result = driver.findElement(By.cssSelector("p#result")).getText();

        System.out.println(result);



    }
}

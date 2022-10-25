package com.homework.day4_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc6_Xpath_Locator_Practice {

    public static void main(String[] args) {

        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2.Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //3. Click on Button 1

        WebElement Btn1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        Btn1.click();

        //Verify text displayed is as expected:
        //Expected: "Clicked on button one!"

WebElement displayed = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        System.out.println("Text is as expected  " + displayed.isDisplayed());


    }




    }



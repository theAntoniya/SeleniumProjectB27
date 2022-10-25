package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) throws InterruptedException {

//        1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");


        WebElement checkbox1= driver.findElement((By.id("box1")));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

//        2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected(), expected false " + checkbox1.isSelected());


//        3. Confirm checkbox #2 is SELECTED by default.

        System.out.println("checkbox2.isSelected() , expecting true " + checkbox2.isSelected());


   //     Thread.sleep(2000);  -----> in order to check in slow version

//        4. Click checkbox #1 to select it.

        checkbox1.click();


//        5. Click checkbox #2 to deselect it.
        checkbox2.click();


//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() , expecting true " + checkbox1.isSelected());


//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() , expecting false " + checkbox2.isSelected());


    }
}

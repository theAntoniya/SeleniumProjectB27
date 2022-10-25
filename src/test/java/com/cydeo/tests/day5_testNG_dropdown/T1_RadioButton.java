package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {

    public static void main(String[] args) {

//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);



//        2. Go to https://practice.cydeo.com/radio_buttons

        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement hockeyBtutton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtutton.click();


        //we can use this instead of writing #4 "if statement".
       // System.out.println(hockeyBtutton.isSelected());

//        4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyBtutton.isSelected()){
            System.out.println("Hockey button is Selected!");
        } else{
            System.out.println("Hockey button is not Selected!");
        }

        //Test all sport radio buttons if they are working

        List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSport : sportRadioBtns) {
            eachSport.click();
            if (eachSport.isSelected()){
                System.out.println(eachSport.getAttribute("id")+ "Radio button is Selected!");
            }

        }
        driver.quit();

     }
}

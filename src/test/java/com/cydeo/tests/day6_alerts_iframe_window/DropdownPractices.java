package com.cydeo.tests.day6_alerts_iframe_window;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. Set up browser
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

        @Test
        public void dropdownTask4(){

            Select selectState= new Select(driver.findElement(By.xpath("//select[@id='state']")));

//            3. Select Illinois using visible text
            selectState.selectByVisibleText("Illinois");



//            4. Select Virginia using value
            selectState.selectByValue("VA");


//            5. Select California using index (we count the number while inspecting)
            selectState.selectByIndex(5);



//            6. Verify final selected option is California.
//            Use all Select options. (visible text, value, index)
            String actualFinalOption = selectState.getFirstSelectedOption().getText();

            String expectedFinalOption = "California";

            Assert.assertEquals(actualFinalOption, expectedFinalOption, "Final selected option is failed");

            //finding index number from options
            int index=-1;
            for (WebElement eachStaste : selectState.getOptions()) {
                index++;
                if(eachStaste.getText().equals("California")){
                    System.out.println(index);
                }

            }


        }

       @Test
    public void dropdownTask7(){
        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
//           3. Select all the options from multiple select dropdown.
           //           4. Print out all selected values.
           for (WebElement eachLanguage : selectLanguage.getOptions()){
               eachLanguage.click();
               System.out.println("eachLanguage.getText() = " + eachLanguage.getText());
           }


//           5. Deselect all values.

           selectLanguage.deselectAll();



       }


    }


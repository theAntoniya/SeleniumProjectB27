package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T1_WebTable_Practice extends TestBase {

//    WebDriver driver;
//    @BeforeMethod
//    public void setUp() {
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @Test
    public void order_name_verify_test() {
//        1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

//        2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”

        WebElement bobMartinName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String expectedBobName = "Bob Martin";
        String actualName = bobMartinName.getText();

        Assert.assertEquals(actualName, expectedBobName);


//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021

        //You can also use this xpath: //td[.=Bob Martin']/../td[5]

        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        Assert.assertEquals(bobMartinOrderDate.getText(), "12/31/2021");

//        String expectedOrder ="12/31/2021";
//        String actualOrderDate = bobMartinOrderDate.getText();
//
//        Assert.assertEquals(actualOrderDate, expectedOrder);
    }

        @Test
        public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Akexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
    }

    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Ned Stark", "05/12/2021");
    }


        @AfterMethod
        public void tearDown(){
            driver.quit();
        }


}

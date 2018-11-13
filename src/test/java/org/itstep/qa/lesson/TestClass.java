package org.itstep.qa.lesson;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;

    @BeforeClass
    public void initWebdriver() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver123.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--kiosk");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void closeBrowser() {
         driver.manage().deleteAllCookies();
         driver.quit();
    }

        @Test(dataProvider = "testValue",
        dataProviderClass = DataValue.class)
                public void testLesson(String value, String key){
            driver.get("https://dev.by/registration");
            // темное место
            System.out.println(value);
            System.out.println(Keys.ENTER);
        }

    }

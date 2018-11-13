package org.itstep.qa.lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEmail {
    WebDriver driver;
// Написать все тесты на валидацию поля email на сайте  https://dev.by/registration
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

    @Test(dataProvider = "user[email]",
            dataProviderClass = DataEmail.class)
    public void testLesson(String value){
        driver.get("https://dev.by/registration");
        // темное место
        WebElement field =
                driver.findElement(By.name("user[email]"));
         field.sendKeys(value);
        Assert.assertTrue(field.isDisplayed(),
                "Не найден результат отправки обращения");
       }
}

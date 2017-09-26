package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/mette/Desktop/Applications/ChromeDriverSeleniumTest/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();

    }
}

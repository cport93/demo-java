package com.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTestsBase extends TestBase {
    public RemoteWebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
}

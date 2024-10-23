package org.openCart.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openCart.driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppHooks {
    private WebDriver driver;
    private DriverFactory driverFactory;


    @Before
    public void driverSetup(){
        driverFactory = new DriverFactory();
        driver = driverFactory.initializeBrowser();

    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}

package org.Google.stepdefinitions;

import org.Google.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp(){

        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(){
        Driver.getDriver().quit();}

}

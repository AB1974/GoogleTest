package org.Google.stepdefinitions;

import org.Google.utilities.ConfigurationReader;
import org.Google.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {

    @Test
    public void loginAmazon(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url2"));
        Driver.getDriver().manage().window().maximize();
       // Driver.getDriver().close();
    }
    @Test
    public void verifyTitle(){
//        Driver.getDriver().get(ConfigurationReader.getProperties("url2"));
//        Driver.getDriver().manage().window().maximize();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Amazon.com. Spend less. Smile more.");
    }
}

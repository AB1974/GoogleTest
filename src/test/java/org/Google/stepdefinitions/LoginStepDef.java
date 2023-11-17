package org.Google.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Google.utilities.ConfigurationReader;
import org.Google.utilities.Driver;
import org.junit.Assert;

import org.Google.pages.Login;


import static org.openqa.selenium.Keys.ENTER;

public class LoginStepDef {
    Login loginPage= new Login();

    String url= ConfigurationReader.getProperties("url");

    @Given("go to url")
    public void go_to_url() {

        Driver.getDriver().get(url);

    }
    @When("search something in Google Search box")
    public void search_something_in_google_search_box() {
       // driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("today.com",ENTER);
        loginPage.search.sendKeys("today.com",ENTER);
    }

    @Then("verify today.com in the page")
    public void verifyTodayComInThePage() {
//junit assert class
        Assert.assertEquals("https://www.today.com",loginPage.link.getText());
    }

    @Then("verify title in the page")
    public void verifyTitleInThePage() {
        String title= Driver.getDriver().getTitle();

        Assert.assertEquals(title,"today.com - Google Search");
    }
    @And("close browser")
    public void closeBrowser() {
        Driver.getDriver().quit();
    }


}

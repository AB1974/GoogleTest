package org.Google.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.Google.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;


public class LoginStepDef {
    WebDriver driver;
    String url= ConfigurationReader.getProperties("url");

    @Given("go to url")
    public void go_to_url() {

        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    @When("search something in Google Search box")
    public void search_something_in_google_search_box() {
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("today.com",ENTER);

    }

    @Then("verify today.com in the page")
    public void verifyTodayComInThePage() {
//junit assert class
        Assert.assertEquals("https://www.today.com",driver.findElement(By.xpath("(//div[.='https://www.today.com'])[1]")).getText());
    }

    @Then("verify title in the page")
    public void verifyTitleInThePage() {
        String title= driver.getTitle();

        Assert.assertEquals(title,"today.com - Google Search");
    }
    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }


}

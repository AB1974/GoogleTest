package org.Google.pages;

import org.Google.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {


    public Login(){
    PageFactory.initElements(Driver.getDriver(),this);

}

    @FindBy(xpath="//textarea[@class='gLFyf']")
    public WebElement search;

    @FindBy(xpath="(//div[.='https://www.today.com'])[1]")
    public WebElement link;
}

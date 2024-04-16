package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SymphonyLogin extends WebBase {


    //@FindBy(xpath = "//button[@class='jss30 jss37 jss45']")
    //protected WebElement btnRegister;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    protected WebElement userInput;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")
    protected WebElement passInput;

    @FindBy(xpath = "//button[@class='jss30 jss37 jss45']")
    protected WebElement loginButton;

    //public void BotonRegistrarse() {
        //var wait = webDriverWait(Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
        //click(btnRegister);

    //}
    public void login(String data, String data1) {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(userInput));
        type(userInput, data);
        type(passInput, data1);
        click(loginButton);
    }

}

package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SymphonyChangeRequest extends WebBase {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/a[4]/div[1]/div[1]/*[1]")
    protected WebElement btnConfigManagement;

    @FindBy(xpath = "//span[contains(text(),'CHANGE REQUEST')]")
    protected WebElement btnChangeRequest;

    @FindBy(xpath = "//span[contains(text(),'NF Initial Configuration')]")
    protected WebElement lblNfInicialConfiguration;

    @FindBy(xpath = "//span[contains(text(),'nf-initial-parameters')]")
    protected WebElement lblNfInicialParameters;


    public void ConfigManagement() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnConfigManagement));
        click(btnConfigManagement);

    }

    public void ChangeRequest() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnChangeRequest));
        click(btnChangeRequest);

    }

    public void InicialConfiguration() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblNfInicialConfiguration));
        click(lblNfInicialConfiguration);

    }

    public void InicialParameters() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblNfInicialParameters));
        click(lblNfInicialParameters);

    }


}

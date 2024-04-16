package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;


public class SymphonyAutomationManagement extends WebBase {
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/*[1]")
    protected WebElement btnMenuAuto;
    @FindBy(xpath = "//span[contains(text(),'Automation Management')]")
    protected WebElement lblAutomation;

    @FindBy(xpath = "//a[@href='/automation/operation']")
    protected WebElement lblOperations;

    public void AutoMenu() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnMenuAuto));
        click(btnMenuAuto);

    }
    public void AutomationManagement() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblAutomation));
        click(lblAutomation);

    }

    public void operation() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblOperations));
        click(lblOperations);

    }


}

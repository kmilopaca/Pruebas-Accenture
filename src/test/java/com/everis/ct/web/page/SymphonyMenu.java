package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SymphonyMenu extends WebBase {

    @FindBy(xpath = "//div[@class='jss34']")
    protected WebElement menuPpal;

    @FindBy(xpath = "//*[@id=\"navigation-menu\"]/div[3]/div/div[1]/span")
    protected WebElement menuIM;

    public void menuPrincipal() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuPpal));
        click(menuPpal);
    }
    public void menuInventoryManagement() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuIM));
        click(menuIM);
    }
}


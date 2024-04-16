package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SymphonyLocations extends WebBase {

    @FindBy(xpath = "//*[contains(text(),'Japan')]")
    protected WebElement lblJapon;

    @FindBy(xpath = "//*[contains(text(),'CU-02')]//following::td[4]/button")
    protected WebElement lblIconDeleteCU02;

    @FindBy(xpath = "//*[contains(text(),'Cancel')]")
    protected WebElement btnCancelar;

    @FindBy(xpath = "//span[contains(text(),'Resources')]")
    protected WebElement lblResources;

    @FindBy(xpath = "//span[contains(text(),'Add Resource')]")
    protected WebElement btnAddResources;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[3]/div[1]/div[2]/nav[3]/div[1]/div[2]/span[1]")
    protected WebElement lblManagedElement;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    protected WebElement btnNext;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock']")
    protected WebElement lblResourcesElement;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    protected WebElement lblName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    protected WebElement lblExternalID;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]")
    protected WebElement lblListaDeStado;

    @FindBy(xpath = "//body/div[@id='menu-lifecycleStatus']/div[3]/ul[1]/li[3]")
    protected WebElement lblOperating;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement btnSave;

    @FindBy(xpath = "//p[contains(text(),'Resource Creation')]")
    protected WebElement lblResourceCreation;

    @FindBy(xpath = "//span[contains(text(),'Accept')]")
    protected WebElement btnAccept;

    public void menuJapan() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblJapon));
        click(lblJapon);
    }

    public void clickCU02() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblIconDeleteCU02));
        click(lblIconDeleteCU02);

    }

    public void clickCancelar() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnCancelar));
        click(btnCancelar);
    }

    public void resources() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblResources));
        click(lblResources);
        click(btnAddResources);
    }

    public void resourceType() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblManagedElement));
        click(lblManagedElement);

    }

    public void botonNext() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnNext));
        click(btnNext);

    }

    public void resourceSpecification() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblResourcesElement));
        click(lblResourcesElement);
        click(btnNext);

    }

    public void creacion(String data, String data1) {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblName));
        type(lblName, data);
        type(lblExternalID, data1);
        click(lblListaDeStado);
    }

    public void operaciones() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblOperating));
        click(lblOperating);
    }

    public void guardar() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnSave));
        click(btnSave);
    }

    public void confirmar() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblResourceCreation));
        click(lblResourceCreation);
    }

    public void confirmarBoton() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnAccept));
        click(btnAccept);
    }

}

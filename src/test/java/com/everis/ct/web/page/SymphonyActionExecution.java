package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SymphonyActionExecution extends WebBase {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/a[5]/div[1]/div[1]/*[1]")
    protected WebElement btnActionExecution;

    @FindBy(xpath = "//span[contains(text(),'Create Action')]")
    protected WebElement btnCreateAction;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
    protected WebElement lblNameAction;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
    protected WebElement lblDescriptionAction;

    @FindBy(xpath = "//input[@id='search-tool']")
    protected WebElement btnFilterResourceType;

    @FindBy(xpath = "//input[@id='search-tool']")
    protected WebElement lblFilterResourceType;

    @FindBy(xpath = "//input[@id='search-tool']")
    protected WebElement lblSelectRollback;

    @FindBy(xpath = "//li[@id='react-autowhatever-1--item-0']")
    protected WebElement lblSelResource;

    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")
    protected WebElement lblListDesplegable;

    @FindBy(xpath = "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")
    protected WebElement lblSelectLista;

    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root jss579']")
    protected WebElement btnAction;

    @FindBy(xpath = "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")
    protected WebElement lblSelectAction;

    @FindBy(xpath = "//body/div[@id='menu-family']/div[3]/ul[1]/li[1]")
    protected WebElement btnSelectAll;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    protected WebElement btnNextAction;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[2]/span[1]/span[1]/input[1]")
    protected WebElement btnScheduledAction;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement btnSaveAction;

    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/button[2]")
    protected WebElement btnSaveActionConfirmation;



    public void MenuActionExecution() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnActionExecution));
        click(btnActionExecution);

    }

    public void CreateAction() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnCreateAction));
        click(btnCreateAction);

    }

    public void NameAndDescription(String data, String data1) {
            var wait = webDriverWait(Duration.ofSeconds(15));
            wait.until(ExpectedConditions.elementToBeClickable(lblNameAction));
            type(lblNameAction, data);
            type(lblDescriptionAction, data1);


    }

    public void FilterResource() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnFilterResourceType));
        click(btnFilterResourceType);
    }
    public void SelectRolSpaces(String data) {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblFilterResourceType));
        type(lblFilterResourceType, data);
    }
    public void SelectRolback() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblSelectRollback));
        click(lblSelectRollback);
        click(lblSelResource);

    }
    public void SelectListDespegable() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(lblListDesplegable));
        click(lblListDesplegable);
        click(lblSelectLista);

    }

    public void SelectAction() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnAction));
        click(btnAction);
        click(lblSelectAction);
    }

    public void SelectAll() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnSelectAll));
        click(btnSelectAll);

    }

    public void SelectNetx() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnNextAction));
        click(btnNextAction);

    }

    public void ScheduledAction() {
        var wait = webDriverWait(Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnScheduledAction));
        click(btnScheduledAction);
        click(btnSaveAction);
        click(btnSaveActionConfirmation);

    }

}

package com.everis.ct.web.page;

import com.everis.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class IngresoPagina extends WebBase {

    @FindBy(xpath = "//a[@id='signin2']")
    protected WebElement btnNewUser;

    @FindBy(xpath = "//h5[@id='signInModalLabel']")
    protected WebElement lblSignUp;

    @FindBy(xpath = "//input[@id='sign-username']")
    protected WebElement lblName;

    @FindBy(xpath = "//input[@id='sign-password']")
    protected WebElement lblPass;

    @FindBy(xpath = "//button[@onclick='register()']")
    protected WebElement btnRegistro;

    @FindBy(xpath = "//a[@id='login2']")
    protected WebElement btnLog;

    @FindBy(xpath = "//h5[@id='logInModalLabel']")
    protected WebElement lblLogIn;
    @FindBy(xpath = "//input[@id='loginusername']")
    protected WebElement lblUsuario;

    @FindBy(xpath = "//input[@id='loginpassword']")
    protected WebElement lblPassword;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    protected WebElement btnLogins;

    @FindBy(xpath = "//a[@id='cat']")
    protected WebElement lblCategories;

    @FindBy(xpath = "//div[@id='contcont']/div/div/div/a[3]")
    protected WebElement lblLaptops;

    @FindBy(xpath = "//a[@class='hrefch']")
    protected WebElement lblLaptopSell;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    protected WebElement btnAddCart;

    @FindBy(xpath = "//a[@id='cartur']")
    protected WebElement btnCart;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    protected WebElement btnPlaceOrder;

    @FindBy(xpath = "//h5[@id='orderModalLabel']")
    protected WebElement lblPlaceO;

    @FindBy(xpath = "//input[@id='name']")
    protected WebElement lblNameT;
    @FindBy(xpath = "//input[@id='country']")
    protected WebElement lblCountry;
    @FindBy(xpath = "//input[@id='city']")
    protected WebElement lblCity;
    @FindBy(xpath = "//input[@id='card']")
    protected WebElement lblCreditCard;
    @FindBy(xpath = "//input[@id='month']")
    protected WebElement lblMonth;
    @FindBy(xpath = "//input[@id='year']")
    protected WebElement lblYear;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    protected WebElement btnPurchase;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    protected WebElement lblComfirPurch;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    protected WebElement btnComfirPurch;
    public void Create() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnNewUser));
        click(btnNewUser);
        click(lblSignUp);
    }

    public void Register(String data, String data1) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblName));
        type(lblName, data);
        type(lblPass, data1);
        click(lblPass);
    }

    public void BtnRegistro() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnRegistro));
        click(btnRegistro);
    }

    public void IngresoUser() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnLog));
        click(btnLog);
        click(lblLogIn);
    }
    public void LoginIngre(String data, String data1) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblUsuario));
        type(lblUsuario, data);
        type(lblPassword, data1);
    }

    public void LogInicio() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogins));
        click(btnLogins);
    }
    public void SeleccionCap() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblCategories));
        click(lblCategories);
        click(lblLaptops);
    }
    public void SelecProduc() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblLaptopSell));
        click(lblLaptopSell);
        click(btnAddCart);
    }
    public void SlectCart() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnCart));
        click(btnCart);
        click(btnPlaceOrder);
    }
    public void DatosOrden(String data, String data1, String data2, String data3, String data4, String data5) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(lblPlaceO));
        type(lblNameT, data);
        type(lblCountry, data1);
        type(lblCity, data2);
        type(lblCreditCard, data3);
        type(lblMonth, data4);
        type(lblYear, data5);
        click(lblYear);
    }
    public void ComfirmarCompra() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnPurchase));
        click(btnPurchase);
        click(lblComfirPurch);
        click(btnComfirPurch);
    }
}
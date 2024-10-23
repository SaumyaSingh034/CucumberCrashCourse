package org.openCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private By email = By.id("input-email");
    private By passWord = By.id("input-password");
    private By loginBtn = By.xpath("//input[@type='submit']");
    private By registerBtn = By.xpath("//*[text()='Continue']");
    private By forgetPassWordLink = By.linkText("Forgotten Password");
    private By errorMsg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public void enterUserName(String username){
        driver.findElement(email).sendKeys(username);
    }
    public void enterPassword(String pass){
        driver.findElement(passWord).sendKeys(pass);
    }

    public void clickOnLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public DashBoardPage doLogin(String userName, String pass){
        driver.findElement(email).sendKeys(userName);
        driver.findElement(passWord).sendKeys(pass);
        driver.findElement(loginBtn).click();
        return new DashBoardPage();
    }

    public void clickonForgetPasswordLink(){
        driver.findElement(forgetPassWordLink).click();

    }

    public RegisterPage clickOnRegisterLink(){
        driver.findElement(registerBtn).click();
        return new RegisterPage();
    }

    public boolean checkErrorMessage(){
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void doInvalidLogin(String userName, String pass){
        driver.findElement(email).sendKeys(userName);
        driver.findElement(passWord).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }



}

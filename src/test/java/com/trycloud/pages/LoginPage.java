package com.trycloud.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement pw;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[contains(@class, 'wrong')]")
    public WebElement errorMessage;

    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        pw.sendKeys(password);
    }

    public void loginWithCredential(String username, String password){
        usernameInput.sendKeys(username);
        pw.sendKeys(password);
        loginBtn.click();
    }




}

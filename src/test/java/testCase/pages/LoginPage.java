package testCase.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    private final By loginId = By.id("dynamika:login");

    private final By passwordId = By.id("dynamika:password");

    private final By loginBtn = By.id("dynamika:submit");

    private final String login;
    private final String password;

    public LoginPage(WebDriver driver, String login, String password) {
        super(driver);
        this.login = login;
        this.password = password;
    }

    public void enter(){
        driver.findElement(loginId).sendKeys(login);
        driver.findElement(passwordId).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}

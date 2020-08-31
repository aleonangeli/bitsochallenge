package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class createAccountPage {
    private WebDriver driver;

    public createAccountPage(WebDriver driver) {
        this.driver = driver;
    }


    private By emailField = By.id("email");
    private By passwordField = By.xpath("//*[@id=\"password\"]");
    private By termsCheck = By.cssSelector(".Checkboxes__StyledBootstrapCheckbox-sc-1sbfpyy-0:nth-child(3) > .custom-control-label");
    private By newsCheck = By.cssSelector(".Checkboxes__StyledBootstrapCheckbox-sc-1sbfpyy-0:nth-child(4) > .custom-control-label");
    private By privacyCheck = By.cssSelector(".Checkboxes__StyledBootstrapCheckbox-sc-1sbfpyy-0:nth-child(5) > .custom-control-label");

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void checkTerms(){
        driver.findElement(termsCheck).click();
    }
    public void checkNews(){
        driver.findElement(newsCheck).click();
    }
    public void checkPrivacy(){
        driver.findElement(privacyCheck).click();
    }


}

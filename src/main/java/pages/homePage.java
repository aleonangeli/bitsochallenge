package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

    private WebDriver driver;
    private By crearCuentaBtn = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[4]/button");

    public homePage(WebDriver driver){
        this.driver = driver;
    }

    public createAccountPage clickCreateAccount() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(crearCuentaBtn).click();
        return new createAccountPage(driver);
    }



}

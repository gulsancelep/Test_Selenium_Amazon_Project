package actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Actions {

    public final WebDriver driver;
    public WebDriverWait pageWait;

    public Actions(WebDriver driver) {
        this.driver = driver;
        pageWait = new WebDriverWait(this.driver, 35);
    }
    public void waitVisibility(By locator) {
        pageWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        waitVisibility(locator);
        driver.findElement(locator).click();
    }

    public void input(By locator,String text) {
        waitVisibility(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public String is_checking(By locator) {
        return driver.findElement(locator).getText();
    }
}

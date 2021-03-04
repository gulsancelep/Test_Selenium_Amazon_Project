package actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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

//    public String is_checking(By locator) {
//        return driver.findElement(locator).getText();
//    }

    public void select_random(By element){
       try {
           waitVisibility(element);
           List<WebElement> random_value = driver.findElements(element);
           Random r = new Random();
           random_value.get(ThreadLocalRandom.current().nextInt(7, 9 + 1)).click();
       } catch (Exception e) {
           select_random(element);
       }

    }
    }



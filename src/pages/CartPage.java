package pages;
import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CartPage extends Actions {

    private  static  final By DELETE = By.cssSelector("input[data-action='delete']");
    private  static  final By CHECKOUT = By.id("sc-buy-box-ptc-button");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void  complete_shopping() {
        click(CHECKOUT);
        ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
    }

    public void  deleteProduct() {
        click(DELETE);
    }
}


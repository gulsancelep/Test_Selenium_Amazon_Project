package pages;
import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Actions {

    private  static  final By ADD_TO_CART = By.id("add-to-cart-button");
    private  static  final By CART_PAGE = By.id("nav-cart-count");
    private  static  final By RANDOM_PRODUCT = By.cssSelector("img[data-image-latency='s-product-image']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void  addToCart() {
        try {
            click(ADD_TO_CART);
        } catch (Exception ignored) {
            ((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
            select_random(RANDOM_PRODUCT);
            addToCart();
        }
    }

    public void  goToCartPage() {
        click(CART_PAGE);
    }
}


package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Actions {

    private  static  final By ADD_TO_CART = By.id("add-to-cart-button");
    private  static  final By CART_PAGE = By.id("nav-cart-count");
    private  static  final By ADDED_TO_CART = By.linkText("Added to Cart");
    private  static  final String ACTUAL = "Added to Cart";


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void  addToCart() {
        click(ADD_TO_CART);
    }

    public void  goToCartPage() {
        click(CART_PAGE);
    }

    public void  is_add_to_cart() {
        Assert.assertEquals(is_checking(ADDED_TO_CART),ACTUAL);
    }
}


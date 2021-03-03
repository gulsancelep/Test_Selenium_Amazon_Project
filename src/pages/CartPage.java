package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Actions {

    private  static  final By DELETE = By.cssSelector("input[data-action='delete']");
    private  static  final By DELETED_PRODUCT = By.linkText("Your Amazon Cart is empty.");
    private  static  final String ACTUAL = "Your Amazon Cart is empty.";


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void  deleteProduct() {
        click(DELETE);
    }

    public void  isDeletedProduct() {
        Assert.assertEquals(is_checking(DELETED_PRODUCT),ACTUAL);
    }
}


package pages;
import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends Actions {

    private  static  final By RANDOM_PRODUCT = By.cssSelector("img[data-image-latency='s-product-image']");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void  productClick() {
        select_random(RANDOM_PRODUCT);
    }
}

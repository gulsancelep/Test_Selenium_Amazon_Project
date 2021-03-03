package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends Actions {

    private  static  final By PRODUCT = By.xpath("((//div[@data-index = 2])[1]//a)[1]");
    private  static  final String IS_SEARCHING_PAGE = "https://www.amazon.com/s?k=Samsung&ref=nb_sb_noss";


    public CategoryPage(WebDriver driver) {
        super(driver);
    }


    public void  productClick() {
        click(PRODUCT);
    }

    public void  isSearchingPage() {
        Assert.assertEquals(IS_SEARCHING_PAGE, driver.getCurrentUrl());
    }
}
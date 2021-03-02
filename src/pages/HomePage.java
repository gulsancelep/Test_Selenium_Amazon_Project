package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Actions {

    private static final By NAV_SIGN_IN = By.id("nav-link-accountList");
    private  static  final String search_input = "Samsung";
    private  static  final By SEARCHING = By.id("twotabsearchtextbox");
    private  static  final By SEARCH_CLICK = By.id("nav-search-submit-button");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        click(NAV_SIGN_IN);
    }

    public void isAmazon() {
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
    }

    public void searching() {
        input(SEARCHING, search_input);
        click(SEARCH_CLICK);
    }
}
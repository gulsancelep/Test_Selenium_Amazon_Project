package pages;
import actions.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Actions {

    private static final By NAV_SIGN_IN = By.id("nav-link-accountList");
    private  static  final By MAIN_CATEGORY = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li");
    private  static  final By NAVBAR = By.cssSelector("#nav-hamburger-menu > i");
    private  static  final By SUBCATEGORY = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void signIn() {
        click(NAV_SIGN_IN);
    }

    public void isAmazon() {
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
    }

    public void randomCategory() {
        click(NAVBAR);
        select_random(MAIN_CATEGORY);
        select_random(SUBCATEGORY);
    }
}

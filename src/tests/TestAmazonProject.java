package tests;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class TestAmazonProject{

    /**
     * Test Case:
     * 1. Go to Amazon website
     * 2. Log in to the website
     * 3. Search for a word and click the product
     * 4. Add item to cart
     * 5. Go to the basket and delete the product
     */

    @Test
    public void testAmazonProject() throws InterruptedException {
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.amazon.com");
        obj.manage().window().maximize();

        HomePage homePage = new HomePage(obj);
        homePage.isAmazon();
        homePage.signIn();

        LoginPage loginPage = new LoginPage(obj);
        loginPage.usernameWrite();
        loginPage.continueClick();
        loginPage.passwordWrite();
        loginPage.signIn();

        homePage.searching();

        CategoryPage categoryPage = new CategoryPage(obj);
        categoryPage.isSearchingPage();
        categoryPage.productClick();

        ProductPage productPage = new ProductPage(obj);
        productPage.addToCart();
        productPage.is_add_to_cart();
        productPage.goToCartPage();

        CartPage cartPage = new CartPage(obj);
        cartPage.deleteProduct();
        cartPage.isDeletedProduct();
    }
}

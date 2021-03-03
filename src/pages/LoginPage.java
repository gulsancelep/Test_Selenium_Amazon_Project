package pages;
import actions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Actions {

    private  static  final By USERNAME = By.id("ap_email");
    private  static  final By PASSWORD = By.id("ap_password");
    private  static  final String username = "loomtestacc@gmail.com";
    private  static  final String password = "wsxzaq1";
    private  static  final By CONTINUE = By.id("continue");
    private  static  final By SIGN_IN = By.id("signInSubmit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void usernameWrite() {
        input(USERNAME, username);
    }

    public void passwordWrite() {
        input(PASSWORD, password);
    }

    public void continueClick() {
        click(CONTINUE);
    }

    public void signIn() {
        click(SIGN_IN);
    }
}

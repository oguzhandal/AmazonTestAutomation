import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {
    SearchBox searchBox;
    By acceptCookiesLocator = By.id("sp-cc-accept");
    By cardCountLocator = By.id("nav-cart-count");

    public HomePage(WebDriver driver) {
        super(driver);
        this.searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox();
    }

    public void acceptCookies() {
        if (isDisplayed(acceptCookiesLocator)) {
            click(acceptCookiesLocator);
        }
    }

    public boolean isProductCountApp() {
        return getCardCount() > 0;
    }

    private int getCardCount() {
        String count = find(cardCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void goToCard() {
        click(cardCountLocator);
    }
}

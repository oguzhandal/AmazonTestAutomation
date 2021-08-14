import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BaseClass {
    By addToCardButtonLocator = By.id("add-to-cart-button");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCardButtonLocator);
    }

    public void addToCard() {
        click(addToCardButtonLocator);
    }
}

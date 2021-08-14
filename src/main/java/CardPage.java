import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BaseClass {
    By productNameLocator = new By.ByClassName("a-truncate-full");

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }

    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }
}

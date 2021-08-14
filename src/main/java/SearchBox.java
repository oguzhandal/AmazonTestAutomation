import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BaseClass {

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By submitSearchButton = By.id("nav-search-submit-button");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator, text);
        click(submitSearchButton);
    }
}

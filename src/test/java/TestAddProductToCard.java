import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestAddProductToCard extends BaseTest {

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;

    @Test
    @Order(1)
    public void searchProduct() {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productPage = new ProductPage(driver);
        homePage.searchBox.search("laptop");
        Assertions.assertTrue(productPage.isOnProductPage(), "Product Page not found");
    }

    @Test
    public void selectProduct() {
        productDetailPage = new ProductDetailPage(driver);
        productPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "product Detail Page is not found");
    }

    @Test
    public void addProductToCard() {
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountApp(), "product count did not increase!");
    }

    @Test
    public void goToCard() {
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue( cardPage.checkIfProductAdded(),"product was not added to card ");
    }
}

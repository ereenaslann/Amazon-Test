import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By buttonLocator = By.id("add-to-cart-button");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDetailPage() {
        return isDisplayed(buttonLocator);
    }

    public void addToCart() {
        click(buttonLocator);
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;


public class HomePage extends BasePage {
    By cartCountLocator = By.id("nav-cart-count");
    By cartContainerLocator = By.id("nav-cart-count-container");
    By acceptCookiesLocator = By.id("sp-cc-accept");
    SearchBox searchBox;
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {

        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;

    }

    public void goToCart() {
        click(cartContainerLocator);
    }
    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return  Integer.parseInt(count);
    }
    public void acceptCookies(){
        if(isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
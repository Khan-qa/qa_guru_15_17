package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.OlxPage;
import pages.components.TopMenuComponent;
import utils.DateForTest;

public class OlxTest extends TestBaseConfiguration {

    DateForTest dateForTest = new DateForTest();
    OlxPage olxPage = new OlxPage();
    TopMenuComponent topMenuComponent = new TopMenuComponent();

    @Test
    @DisplayName("Проверка видимости элементов верхнего меню")
    void openMainPage() {
        olxPage.openMainPage();
        topMenuComponent.checkThatHeaderLogoButtonVisible()
                .checkThatMessageButtonVisible()
                .checkThatFavoritesButtonVisible()
                .checkThatYourProfileButtonVisible()
                .checkThatSubmitAnAdButtonVisible();
    }

    @Test
    @DisplayName("Проверка поиска товара")
    void productSearchTest() {
        olxPage.openMainPage()
                .searchProduct(dateForTest.product);
    }

    @Test
    @DisplayName("Проверка деталей товара")
    void productDescriptionTest() {
        olxPage.openMainPage()
                .searchProduct(dateForTest.product)
                .openProductDetails();
    }

    @Test
    @DisplayName("Добавление товара в список Избранные")
    void addProductToFavorite() {
        olxPage.openMainPage()
                .searchProduct(dateForTest.product)
                .openProductDetails()
                .addingProductToFavorites();
    }

    @Test
    @DisplayName("Проверка текста на странице Избранных товаров")
    void checkFavoriteProducts() {
        olxPage.openMainPage()
                .searchProduct(dateForTest.product)
                .openProductDetails()
                .addingProductToFavorites()
                .openFavoritesPage()
                .checkVisibleText();

    }
}

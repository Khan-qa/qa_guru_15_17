package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class OlxPage {

    public OlxPage dismissCookiesBanner() {
        $("[data-testid='dismiss-cookies-banner']").shouldBe(visible).click();
        return this;
    }

    @Step("Открытие сайта OLX")
    public OlxPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Открытие страницы с избранными товарами")
    public OlxPage openFavoritesPage() {
        open("/favorites");
        return this;
    }

    @Step("Поиск товара {product}")
    public OlxPage searchProduct(String product) {
        $("#headerSearch").setValue(product).pressEnter();
        return this;
    }

    @Step("Открытие деталей товара")
    public OlxPage openProductDetails() {
        $$("[data-testid='listing-grid']").filter(visible).first().scrollIntoView("{block: \"center\"}").click();
        return this;
    }

    @Step("Добавление товара в избранные")
    public OlxPage addingProductToFavorites() {
        $x("//span[text()='Опубликовано']/following::div[1]").scrollIntoView("{block: \"center\"}").click();
        return this;
    }

    @Step("Проверка текста на странице избранных товаров")
    public OlxPage checkVisibleText() {
        $x("//h2[text() = 'Избранные объявления']").shouldBe(visible);
        return this;
    }

}

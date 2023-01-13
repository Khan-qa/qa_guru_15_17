package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuComponent {
    private final SelenideElement
            messageButton = $("#nav-conversations"),
            favoritesButton = $("#observed-counter"),
            yourProfileButton = $("#my-account-link"),
            headerLogo = $("#headerLogo"),
            submitAnAd = $("#postNewAdLink");

    // check visible
    @Step("Проверка видимости кнопки 'Сообщения'")
    public TopMenuComponent checkThatMessageButtonVisible() {
        messageButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка видимости кнопки 'Избранное'")
    public TopMenuComponent checkThatFavoritesButtonVisible() {
        favoritesButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка видимости кнопки профиля")
    public TopMenuComponent checkThatYourProfileButtonVisible() {
        yourProfileButton.shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка видимости логотипа")
    public TopMenuComponent checkThatHeaderLogoButtonVisible() {
        headerLogo.shouldBe(Condition.visible);
        return this;
    }

    @Step("Проверка видимости кнопки 'Подать объявление'")
    public TopMenuComponent checkThatSubmitAnAdButtonVisible() {
        submitAnAd.shouldBe(Condition.visible);
        return this;
    }

    //click element (тут можно расписать клики по элементам)
    @Step("клик по кнопки 'избранные'")
    public TopMenuComponent clickFavoritesButton() {
        favoritesButton.click();
        return this;
    }
}

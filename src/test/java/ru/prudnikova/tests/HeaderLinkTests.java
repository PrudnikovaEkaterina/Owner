package ru.prudnikova.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.prudnikova.pages.MainPage;
import ru.prudnikova.pages.components.Header;


@DisplayName("Переход по ссылкам в header")

public class HeaderLinkTests extends TestBase {
    MainPage mainPage = new MainPage();
    Header header = new Header();

    @BeforeEach
    void beforeEach() {
        mainPage.openMainPage();
    }

    @Test
    @Owner("PrudnikovaEkaterina")
    @Tag("Web")
    @DisplayName("Переход по ссылке 'Новостройки'")
    void followingNovostroykiLink() {
        header.verifyColorNovostroykiLinkHover()
                .followingNovostroykiLink().verifyFollowingNovostroykiLink();
    }

    @Test
    @Owner("PrudnikovaEkaterina")
    @Tag("Web")
    @DisplayName("Открытие модального окна по ссылке 'Помощь в подборе'")
    void followingHelpInChoosingLink() {
        header.verifyColorHelpInChoosingHover()
                .followingHelpInChoosingLink().verifyApartmentQuizModalTitle();
    }

    @Test
    @Owner("PrudnikovaEkaterina")
    @Tag("Web")
    @DisplayName("Переход по ссылке 'O компании'")
    void followingAboutLink() {
        header.verifyColorAboutLinkHover()
                .followingAboutLink().verifyFollowingAboutLink();
    }

    @Test
    @Owner("PrudnikovaEkaterina")
    @Tag("Web")
    @DisplayName("Переход по ссылке 'Контакты'")
    void followingContactsLink() {
        header.verifyColorContactsLinkHover()
                .followingContactsLink().verifyFollowingContactsLink();
    }

    @Test
    @Owner("PrudnikovaEkaterina")
    @Tag("Web")
    @DisplayName("Переход по ссылке 'Войти'")
    void followingSingInLink() {
        header.verifyColorSingInLinkHover()
                .followingSingInLink().verifyFollowingSingInLink();
    }
}

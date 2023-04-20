package ru.prudnikova.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Header {
    HelpInChoosingModalWindow helpInChoosingModalWindow = new HelpInChoosingModalWindow();

    private final SelenideElement
            NOVOSTROYKI = $x("//a[text()=' Новостройки ']"),
            HELPINCHOOSING = $x("//a[text()=' Помощь в подборе ']"),
            ABOUT = $("[href='/about']"),
            CONTACTS = $("[href='/contacts']"),
            SIGNIN = $x("//span[text()='Войти']");


    public Header verifyColorNovostroykiLinkHover() {
        NOVOSTROYKI.hover().shouldHave(Condition.cssValue("color", "rgba(107, 109, 203, 1)"));
        return this;
    }

    public Header followingNovostroykiLink() {
        NOVOSTROYKI.click();
        return this;
    }

    public void verifyFollowingNovostroykiLink() {
        Assertions.assertEquals("https://novo-estate.ru/novostroyki", url());
    }

    public Header verifyColorHelpInChoosingHover() {
        HELPINCHOOSING.hover().shouldHave(Condition.cssValue("color", "rgba(107, 109, 203, 1)"));
        return this;
    }

    public Header followingHelpInChoosingLink() {
        HELPINCHOOSING.click();
        return this;
    }

    public void verifyApartmentQuizModalTitle() {
        helpInChoosingModalWindow.verifyApartmentQuizModalTitle();
    }

    public Header verifyColorAboutLinkHover() {
        ABOUT.hover().shouldHave(Condition.cssValue("color", "rgba(107, 109, 203, 1)"));
        return this;
    }

    public Header followingAboutLink() {
        ABOUT.click();
        return this;
    }

    public void verifyFollowingAboutLink() {
        Assertions.assertEquals("https://novo-estate.ru/about", url());
    }

    public Header verifyColorContactsLinkHover() {
        CONTACTS.hover().shouldHave(Condition.cssValue("color", "rgba(107, 109, 203, 1)"));
        return this;
    }

    public Header followingContactsLink() {
        CONTACTS.click();
        return this;
    }

    public void verifyFollowingContactsLink() {
        Assertions.assertEquals("https://novo-estate.ru/contacts", url());
    }

    public Header verifyColorSingInLinkHover() {
        SIGNIN.hover().shouldHave(Condition.cssValue("color", "rgba(84, 83, 179, 1)"));
        return this;
    }

    public Header followingSingInLink() {
        SIGNIN.click();
        return this;
    }

    public void verifyFollowingSingInLink() {
        Assertions.assertEquals("https://novo-estate.ru/auth", url());
    }


}

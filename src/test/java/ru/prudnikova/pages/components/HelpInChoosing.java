package ru.prudnikova.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HelpInChoosing {
    private final SelenideElement APARTMENTQUIZMODALTITLE = $(".apartment-quiz-modal__title");

    public void verifyApartmentQuizModalTitle() {
        APARTMENTQUIZMODALTITLE.shouldBe(Condition.visible)
                .shouldHave(Condition.text("Бесплатно подберем квартиру по вашим критериям!"));
    }

}

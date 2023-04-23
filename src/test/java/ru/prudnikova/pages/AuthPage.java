package ru.prudnikova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthPage {
    private final SelenideElement
            INPUTPHONE = $x("//input[@type='tel']"),
            CHECKBOX = $(".el-checkbox__inner"),
            BUTTONSENDCODE = $x("//span[text()='Отправить код для входа ']"),
            INPUTPASSWORD= $x("//input[@type='text']");

    public AuthPage setPhone(String phone) {
        INPUTPHONE.setValue(phone);
        return this;
    }

    public AuthPage clickCheckbox() {
        CHECKBOX.click();
        return this;
    }

    public AuthPage clickButtonSendCode() {
        BUTTONSENDCODE.click();
        return this;
    }

    public AuthPage setPassword(String password) {
        INPUTPASSWORD.setValue(password);
        return this;
    }

}

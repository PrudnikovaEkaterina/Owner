package ru.prudnikova.pages;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openMainPage() {
        open(baseUrl);
        return this;
    }

}

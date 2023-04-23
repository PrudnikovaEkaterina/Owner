package ru.prudnikova.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.prudnikova.config.AuthConfig;
import ru.prudnikova.config.ProjectConfig;
import ru.prudnikova.pages.MainPage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    @Test
    void loginTest() throws IOException {
        Configuration.remote="https://user1:1234@selenoid.autotests.cloud/wd/hub";
        AuthConfig config = ConfigCache.getOrCreate(AuthConfig.class);
        String phone=config.phone();
        String password = config.password();

        open("https://master.dev.novo-estate.ru/");
        $(".one-column-header__account-text").click();
        $x("//input[@type='tel']").setValue(phone);
        $(".el-checkbox__inner").click();
        $x("//span[text()='Отправить код для входа ']").click();
        $x("//input[@type='text']").setValue(password);




    }

}

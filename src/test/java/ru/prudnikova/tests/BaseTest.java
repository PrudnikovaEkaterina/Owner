package ru.prudnikova.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigCache;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.prudnikova.config.ProjectConfig;
import ru.prudnikova.helpers.Attach;

import java.util.Map;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        ProjectConfig projectConfig = ConfigCache.getOrCreate(ProjectConfig.class);
        Configuration.baseUrl = projectConfig.baseUrl();
        Configuration.browser = projectConfig.browser();
        Configuration.browserVersion = projectConfig.browserVersion();
        Configuration.browserSize = projectConfig.browserSize();
        Configuration.remote = projectConfig.remote();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true));
        Configuration.browserCapabilities = capabilities;
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}

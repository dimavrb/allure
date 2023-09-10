package com.github.dimavrb.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "firefox";
        Configuration.pageLoadStrategy = "eager";
        Selenide.open("https://github.com/dimavrb/allure");
    }

}
package com.github.dimavrb.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.dimavrb.pages.RepositoryMainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class IssueTest extends TestBase {

    String issueName = "TestIssue";

    RepositoryMainPage repositoryMainPage = new RepositoryMainPage();

    WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Проверка задачи в GitHub")
    void checkIssueTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        repositoryMainPage.clickToIssueTab();
        repositoryMainPage.assertIssueName(issueName);

    }


    @Test
    @DisplayName("Проверка задачи через lambda")
    void checkIssueLambdaTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Переход на таб с issue", () -> repositoryMainPage.clickToIssueTab());
        step("Проверка имени задачи ", () -> repositoryMainPage.assertIssueName(issueName));


    }

    @Test
    @DisplayName("Проверка задачи через step")
    void checkIssueStepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openIssuesTab();
        steps.checkIssueName(issueName);


    }
}

package com.github.dimavrb.test;

import com.github.dimavrb.pages.RepositoryIssueTab;
import com.github.dimavrb.pages.RepositoryMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class IssueTest extends TestBase {

    String issueName = "TestIssue";

    RepositoryMainPage repositoryMainPage = new RepositoryMainPage();
    RepositoryIssueTab repositoryIssueTab = new RepositoryIssueTab();

    WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Проверка задачи в GitHub")
    void checkIssueTest() {

        repositoryMainPage.clickToIssueTab();
        repositoryIssueTab.assertIssueName(issueName);

    }


    @Test
    @DisplayName("Проверка задачи через lambda")
    void checkIssueLambdaTest() {
        step("Переход на таб с issue", () -> repositoryMainPage.clickToIssueTab());
        step("Проверка имени задачи ", () -> repositoryIssueTab.assertIssueName(issueName));


    }

    @Test
    @DisplayName("Проверка задачи через step")
    void checkIssueStepTest() {

        steps.openIssuesTab();
        steps.checkIssueName(issueName);


    }
}

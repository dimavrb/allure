package com.github.dimavrb.test;

import com.github.dimavrb.pages.RepositoryIssueTab;
import com.github.dimavrb.pages.RepositoryMainPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;

public class WebSteps {
    RepositoryMainPage repositoryMainPage = new RepositoryMainPage();
    RepositoryIssueTab repositoryIssueTab = new RepositoryIssueTab();

    @Step("Переход на таб с issue")
    public void openIssuesTab() {
        repositoryMainPage.issueTab.click();
    }

    @Step("Проверка имени задачи")
    public void checkIssueName(String value) {
        repositoryIssueTab.issueLink.shouldHave(text(value));
    }


}
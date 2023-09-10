package com.github.dimavrb.test;

import com.github.dimavrb.pages.RepositoryMainPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WebSteps {
    RepositoryMainPage repositoryMainPage = new RepositoryMainPage();

    @Step("Open Issues tab")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Check name issue")
    public void checkIssueName(String value) {
        repositoryMainPage.issueLink.shouldHave(text(value));
    }


}
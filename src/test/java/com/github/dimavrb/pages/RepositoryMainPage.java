package com.github.dimavrb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RepositoryMainPage {
    public SelenideElement
            issueTab = $("#issues-tab"),
            issueLink = $("#issue_1_link");


    public RepositoryMainPage clickToIssueTab() {

        issueTab.click();

        return this;
    }


    public RepositoryMainPage assertIssueName(String value) {

        issueLink.shouldHave(text(value));
        return this;

    }
}
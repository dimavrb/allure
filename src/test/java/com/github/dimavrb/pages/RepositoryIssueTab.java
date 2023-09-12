package com.github.dimavrb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RepositoryIssueTab {

    public SelenideElement
            issueLink = $("#issue_1_link");


    public RepositoryIssueTab assertIssueName(String value) {

        issueLink.shouldHave(text(value));
        return this;

    }
}


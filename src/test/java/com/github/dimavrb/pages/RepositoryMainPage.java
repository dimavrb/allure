package com.github.dimavrb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RepositoryMainPage {
    public SelenideElement issueTab = $("#issues-tab");


    public RepositoryMainPage clickToIssueTab() {

        issueTab.click();

        return this;
    }


}
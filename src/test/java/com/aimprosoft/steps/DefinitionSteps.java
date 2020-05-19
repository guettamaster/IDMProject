package com.aimprosoft.steps;

import com.aimprosoft.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.net.URISyntaxException;
import java.util.Map;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//======================================================SignInPage======================================================

    @Given("^open signin page$")
    public void openSignInPage(){
        endUserSteps.openSignInPage();
    }

    @And("^filled fields valid data$")
    public void filledFieldsValidData() throws Throwable {
        endUserSteps.loginAsuser();
    }

    @When("^click on Login button$")
    public void clickOnLoginButton() throws Throwable {
        endUserSteps.clickOnLoginButton();
    }

    @Then("^home page is opened$")
    public void homePageIsOpened() {
        endUserSteps.homePageIsOpened();
    }

    @Then("^\"([^\"]*)\" user name is displayed$")
    public void userNameIsDisplayed(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayed(arg0);
    }

    @And("^filled fields valid data by admin$")
    public void filledFieldsValidDataByAdmin() {
        endUserSteps.loginAsadmin();
    }

    @When("^click on the \"([^\"]*)\" link at the header$")
    public void clickOnTheLinkAtTheHeader(String arg0) throws Throwable {
        endUserSteps.clickOnTheLinkAtTheHeader(arg0);
    }

    @Then("^\"([^\"]*)\" page is displayed$")
    public void pageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.pageIsDisplayed(arg0);
    }

    @When("^click on the \"([^\"]*)\" link in the left panel$")
    public void clickOnTheLinkInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheLinkInTheLeftPanel(arg0);
    }

    @Then("^\"([^\"]*)\" sub-page is displayed$")
    public void subPageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.subPageIsDisplayed(arg0);
    }

    @Then("^Search field is displayed$")
    public void searchFieldIsDisplayed() {
        endUserSteps.searchFieldIsDisplayed();
    }

    @When("^enter \"([^\"]*)\" in the Search field$")
    public void enterInTheSearchField(String arg0) throws Throwable {
        endUserSteps.enterInTheSearchField(arg0);
    }

    @When("^click on the Browse button$")
    public void clickOnTheBrowseButton() {
        endUserSteps.clickOnTheBrowseButton();
    }

    @Then("^\"([^\"]*)\" group is displayed in the table$")
    public void groupIsDisplayedInTheTable(String arg0) throws Throwable {
        endUserSteps.groupIsDisplayedInTheTable(arg0);
    }

    @When("^click on the \"([^\"]*)\" group$")
    public void clickOnTheGroup(String arg0) throws Throwable {
        endUserSteps.clickOnTheGroup(arg0);
    }

    @Then("^users block is displayed$")
    public void usersBlockIsDisplayed() {
        endUserSteps.usersBlockIsDisplayed();
    }

    @When("^click on the Add User icon$")
    public void clickOnTheAddUserIcon() {
        endUserSteps.clickOnTheAddUserIcon();
    }

    @Then("^Add User pop-up is appeared$")
    public void addUserPopUpIsAppeared() {
        endUserSteps.addUserPopUpIsAppeared();
    }

    @When("^enter \"([^\"]*)\" in the Search for users field$")
    public void enterInTheSearchForUsersField(String arg0) throws Throwable {
        endUserSteps.enterInTheSearchForUsersField(arg0);
    }

    @When("^click on the Search button$")
    public void clickOnTheSearchButton() {
        endUserSteps.clickOnTheSearchButton();
    }

    @Then("^\"([^\"]*)\" user name is displayed in the Add User pop-up$")
    public void userNameIsDisplayedInTheAddUserPopUp(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheAddUserPopUp(arg0);
    }

    @When("^click on the Add button$")
    public void clickOnTheAddButton() {
        endUserSteps.clickOnTheAddButton();
    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void messageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageIsDisplayed(arg0);
    }

    @Then("^\"([^\"]*)\" user is added to the users block$")
    public void userIsAddedToTheUsersBlock(String arg0) throws Throwable {
        endUserSteps.userIsAddedToTheUsersBlock(arg0);
    }

    @When("^click on remove icon on the \"([^\"]*)\" user name$")
    public void clickOnRemoveIconOnTheUserName(String arg0) throws Throwable {
        endUserSteps.clickOnRemoveIconOnTheUserName(arg0);
    }

    @Then("^Remove User from Group pop-up is appeared$")
    public void removeUserFromGroupPopUpIsAppeared() {
        endUserSteps.removeUserFromGroupPopUpIsAppeared();
    }

    @When("^click on the Yes button$")
    public void clickOnTheYesButton() {
        endUserSteps.clickOnTheYesButton();
    }

    @Then("^\"([^\"]*)\" user is removed from the group$")
    public void userIsRemovedFromTheGroup(String arg0) throws Throwable {
        endUserSteps.userIsRemovedFromTheGroup(arg0);
    }

    @When("^click on the \"([^\"]*)\" user name$")
    public void clickOnTheUserName(String arg0) throws Throwable {
        endUserSteps.clickOnTheUserName(arg0);
    }

    @Then("^user menu is appeared$")
    public void userMenuIsAppeared() {
        endUserSteps.userMenuIsAppeared();
    }

    @When("^click My Profile link$")
    public void clickMyProfileLink() {
        endUserSteps.clickMyProfileLink();
    }

    @Then("^User Profile page is opened$")
    public void userProfilePageIsOpened() {
        endUserSteps.userProfilePageIsOpened();
    }

    @When("^click the \"([^\"]*)\" link$")
    public void clickTheLink(String arg0) throws Throwable {
        endUserSteps.clickTheLink(arg0);
    }

    @Then("^\"([^\"]*)\" page is opened$")
    public void pageIsOpened(String arg0) throws Throwable {
        endUserSteps.pageIsOpened(arg0);
    }

    @Then("^Generate Documents block is displayed$")
    public void generateDocumentsBlockIsDisplayed() {
        endUserSteps.generateDocumentsBlockIsDisplayed();
    }

    @Then("^Generated Documents block is displayed$")
    public void generatedDocumentsBlockIsDisplayed() {
        endUserSteps.generatedDocumentsBlockIsDisplayed();
    }

    @When("^click on the Type drop-down menu$")
    public void clickOnTheTypeDropDownMenu() {
        endUserSteps.clickOnTheTypeDropDownMenu();
    }

    @When("^choose the Пакет документов item$")
    public void chooseTheПакетДокументовItem() {
        endUserSteps.chooseTheПакетДокументовItem();
    }

    @When("^click on the Template drop-down menu$")
    public void clickOnTheTemplateDropDownMenu() {
        endUserSteps.clickOnTheTemplateDropDownMenu();
    }

    @When("^choose the Договір Підряду \\(фінальна версія\\) item$")
    public void chooseTheДоговірПідрядуФінальнаВерсіяItem() {
        endUserSteps.chooseTheДоговірПідрядуФінальнаВерсіяItem();
    }

    @Then("^Documents will be created section is appeared$")
    public void documentsWillBeCreatedSectionIsAppeared() {
        endUserSteps.documentsWillBeCreatedSectionIsAppeared();
    }
}

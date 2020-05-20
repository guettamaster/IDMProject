package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://aim-dms.aimprosoft.com/share/page/")

public class DocumentPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(GroupPage.class);

    public void clickOnTheUserName(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.USER_NAME_AFTER_AUTHORIZATION.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_AFTER_AUTHORIZATION.replace("$1", arg0)));
    }

    public boolean userMenuIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.USER_MENU)));
        return $(LOCATORS.USER_MENU).isPresent();
    }

    public void clickMyProfileLink() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.MY_PROFLE_LINK));
    }

    public boolean userProfilePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.USER_PROFILE_PAGE_TITLE)));
        return $(LOCATORS.USER_PROFILE_PAGE_TITLE).isPresent();
    }

    public void clickTheLink(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.LINK_ON_THE_PROFILE_PAGE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.LINK_ON_THE_PROFILE_PAGE.replace("$1", arg0)));
    }

    public boolean pageIsOpened(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.PAGE_ON_THE_PROFILE_PAGE.replace("$1", arg0))));
        return $(LOCATORS.PAGE_ON_THE_PROFILE_PAGE.replace("$1", arg0)).isPresent();
    }

    public boolean generateDocumentsBlockIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.GENERATE_DOCUMENTS_TITLE)));
        return $(LOCATORS.GENERATE_DOCUMENTS_TITLE).isPresent();
    }

    public boolean generatedDocumentsBlockIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.GENERATED_DOCUMENTS_TITLE)));
        return $(LOCATORS.GENERATED_DOCUMENTS_TITLE).isPresent();
    }

    public void clickOnTheTypeDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TYPE_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheПакетДокументовItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_TYPE_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_TYPE_DROP_DOWN_MENU).click();
    }

    public void clickOnTheTemplateDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TEMPLATE_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheДоговірПідрядуФінальнаВерсіяItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_TEMPLATE_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_TEMPLATE_DROP_DOWN_MENU).click();
    }

    public boolean documentsWillBeCreatedSectionIsAppeared() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath(LOCATORS.DOCUMENTS_WILL_BE_CREATED_TITLE)));
        return $(LOCATORS.DOCUMENTS_WILL_BE_CREATED_TITLE).isPresent();
    }

    public void clickOnTheContractorDropDownMenu() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.CONTRACTOR_DROP_DOWN_MENU)));
        actions.click().build().perform();
    }

    public void chooseTheФлайтехItem() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU)));
        $(LOCATORS.OPTION_ITEM_FROM_THE_CONTRACTOR_DROP_DOWN_MENU).click();
    }

    public void enterInTheContractDateField(String arg0) {
        Actions actions = new Actions(getDriver());
        $(LOCATORS.CONTRACT_DATE_FIELD.replace("$1", arg0)).sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.CONTRACT_DATE_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }
}

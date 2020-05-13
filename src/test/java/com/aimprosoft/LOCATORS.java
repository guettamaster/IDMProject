package com.aimprosoft;

public interface LOCATORS {


//TODO======================================================SignInPage========================================================

    String USER_NAME_FIELD = "//input[@placeholder='User Name']";
    String PASSWORD_FIELD = "//input[@placeholder='Password']";
    String SIGNIN_BUTTON = "//button[.='Sign In']";

//TODO======================================================HomePage==========================================================

    String HOME_PAGE_LINK = "//a[.='Home']";
    String USER_NAME_AFTER_AUTHORIZATION = "//span[@data-dojo-attach-point][.='$1']";
    String ADMIN_TOOLS_LINK = "//a[@class='alfresco-navigation-_HtmlAnchorMixin'][contains(text(),'$1')]";

//TODO======================================================AdminToolsPage====================================================

    String ADMIN_TOOLS_TITLE = "//span[@class='alfresco-header-Title__text has-max-width'][contains(text(),'$1')]";
    String GROUPS_LINK = "//a[@title='Group Management'][contains(text(),'$1')]";
    String GROUPS_TITLE = "//label[@for='page_x002e_ctool_x002e_admin-console_x0023_default-search-text'][contains(text(),'$1')]";
    String SEARCH_FIELD = "//input[@id='page_x002e_ctool_x002e_admin-console_x0023_default-search-text']";

}
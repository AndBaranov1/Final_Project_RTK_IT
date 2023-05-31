package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StoreSteamPoweredPage {
    private SelenideElement
    loginBtn =  $(".global_action_link:nth-child(2)"),
    setLogin = $(".newlogindialog_TextField_2KXGK:nth-child(1) > .newlogindialog_TextInput_2eKVn"),
    setPassword = $(".newlogindialog_TextField_2KXGK:nth-child(2) > .newlogindialog_TextInput_2eKVn"),
    submitBtn =  $(".newlogindialog_SubmitButton_2QgFE"),
    tabNewAndInrteresting = $(byText("Новое и интересное")),
    tabPopular = $("#noteworthy_flyout .popup_menu_item:nth-child(3)"),
    clickGame =  $(".weeklytopsellers_TableRow_2-RN6"),
    addBasketBtn =  $("#btn_add_to_cart_54029 > span"),
    verifyPrimeStatus = $(".cart_item_desc > a"),
    setClickFieldSearch = $("#store_nav_search_term"),
    clickSearchBtn = $("#store_search_link > img"),
    chooseGameDota2 =  $(".search_result_row:nth-child(1) .search_name > div"),
    verifyNameGame = $("#appHubAppName");



    public StoreSteamPoweredPage openPage() {
        open("https://store.steampowered.com/");
        return this;
    }

    public StoreSteamPoweredPage clickLoginBtn() {
        loginBtn.click();
        return this;
    }

    public StoreSteamPoweredPage setInputLogin(String value) {
        setLogin.setValue(value);
        return this;
    }

    public StoreSteamPoweredPage setInputPassword(String value) {
        setPassword.setValue(value);
        return this;
    }

    public StoreSteamPoweredPage clickSubmitButton() {
        submitBtn.click();
        return this;
    }

    public StoreSteamPoweredPage changeNewAndInteresting() {
        tabNewAndInrteresting.hover();
        return this;
    }

    public StoreSteamPoweredPage clickTabPopular() {
        tabPopular.click();
        return this;
    }

    public StoreSteamPoweredPage clickGameInList() {
        clickGame.click();
        return this;
    }

    public StoreSteamPoweredPage clickAddBasketBtn() {
        addBasketBtn.click();
        return this;
    }

    public StoreSteamPoweredPage verifyBasketPrimeStatus(String value) {
        verifyPrimeStatus.shouldHave(text(value));
        return this;
    }

    public StoreSteamPoweredPage clickFieldSearch() {
        setClickFieldSearch.click();
        return this;
    }

    public StoreSteamPoweredPage setInputSearch(String value) {
        setClickFieldSearch.setValue(value);
        return this;
    }

    public StoreSteamPoweredPage clickSearchButton() {
        clickSearchBtn.click();
        return this;
    }

    public StoreSteamPoweredPage selectGameDota2() {
        chooseGameDota2.click();
        return this;
    }

    public StoreSteamPoweredPage verifyNameGameDota2(String value) {
        verifyNameGame.shouldHave(text(value));
        return this;
    }
}
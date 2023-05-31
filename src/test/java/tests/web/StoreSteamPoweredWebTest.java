package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class StoreSteamPoweredWebTest extends TestBase {

    @DisplayName("Authorization user")
    @Test
    void userAuthorization() {
        step("Open form Steam", () -> {
            steamPoweredPage.openPage();
        });

        step("Click login Button", () -> {
            steamPoweredPage.clickLoginBtn();
        });

        step("Fill in the login field", () -> {
            steamPoweredPage.setInputLogin("Autotester_qa_demo");
        });

        step("Fill in the password field", () -> {
            steamPoweredPage.setInputPassword("Db)cE*FUD3Dw98L");
        });

        step("Click login submit button", () -> {
            steamPoweredPage.clickSubmitButton();
        });
    }

    @DisplayName("Add prime status game in basket")
    @Test
    void addPrimeStatusGameInBasket() {
        step("Open form Steam", () -> {
            steamPoweredPage.openPage();
        });

        step("Hover your mouse over the section new and interesting", () -> {
            steamPoweredPage.changeNewAndInteresting();
        });

        step("Click tab most popular", () -> {
            steamPoweredPage.clickTabPopular();
        });

        step("Click game in list", () -> {
            steamPoweredPage.clickGameInList();
        });

        step("Click add basket button", () -> {
            steamPoweredPage.clickAddBasketBtn();
        });

        step("Verify in basket prime status", () -> {
            steamPoweredPage.verifyBasketPrimeStatus("прайм-статус");
        });
    }

    @DisplayName("Search and selection of the game dota 2")
    @Test
    void searchGameDota2() {
        step("Open form Steam", () -> {
            steamPoweredPage.openPage();
        });

        step("Click search field", () -> {
            steamPoweredPage.clickFieldSearch();
        });

        step("Enter in search Dota 2", () -> {
            steamPoweredPage.setInputSearch("Dota 2");
        });

        step("Click search button", () -> {
            steamPoweredPage.clickSearchButton();
        });

        step("Select game Dota 2 from list page", () -> {
            steamPoweredPage.selectGameDota2();
        });

        step("Verify name game Dota 2", () -> {
            steamPoweredPage.verifyNameGameDota2("Dota 2");
        });
    }
}
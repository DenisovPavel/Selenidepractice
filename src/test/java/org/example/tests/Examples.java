package org.example.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Examples {
    @Test
    public void userCanLoginByUsername() {
        open("/login");
        $(By.name("user.name")).setValue("johny");
        $("#submit").click();
        $(".loading_progress").should(disappear); // Само подождёт, пока элемент исчезнет
        $("#username").shouldHave(text("Hello, Johny!")); // Само подождёт, пока у элемента появится нужный текст


//        1. открыть(страницу)
//        2. $(элемент).совершитьДействие()
//        3. $(элемент).проверитьУсловие()

//        open("/login");
//        $("#submit").click();
//        $(".message").shouldHave(text("Привет"));
//        open(URL)
//        $(String cssSelector) -
//        возвращает объект типа SelenideElement,
//        который представляет первый найденный по CSS селектору элемент на странице
//        $(By) - возвращает "первый SelenideElement" по локатору типа By
//        $$(String cssSelector) - возвращает объект типа ElementsCollection,
//        который представляет коллекцию всех элементов найденных по CSS селектру
//        $$(By) - возвращает "коллекцию элементов" по локатору типа By
//        Обычно, когда ты получаешь с помощью доллара объект SelenideElement,
//        ты можешь либо совершить с ним какое-то действие:
//
//        $(byText("Sign in")).click();
//        и даже несколько действий сразу:
//
//        $(byName("password")).setValue("qwerty").pressEnter();
//        либо проверить какое-то условие:
//
//        $(".wellcome-message").shouldHave(text("Welcome, user!")).
//        “Два доллара” же может быть удобно использовать когда нужный элемент
//        является одним из группы однотипных элементов.
//        Например вместо:
//        $(byXpath("//*[@id='search-results']//a[contains(text(),'selenide.org')]")).click();
//        можно использовать более читабельный и лаконичный вариант:
//        $$("#search-results a").findBy(text("selenide.org")).click();
    }
}
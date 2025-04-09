package org.example.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FirstSelenideTest {

    @Test
    public void firstTest() {
        SoftAssert softAssert = new SoftAssert();
        Selenide.open("http://yahoo.com");

        $(By.name("p")).val("hello world").sendKeys(Keys.ENTER);
        softAssert.assertTrue($(By.name("p")).is(Condition.attribute("value", "hello world")), "Hello world assert");

        $(By.xpath("//*[@name='p']")).setValue("hello world 2").sendKeys(Keys.ENTER);
        softAssert.assertTrue($(By.name("p")).getAttribute("value").contains("hello world"), "Hello world 2 assert");

        $x("//*[@name='p']").setValue("hello world 3").pressEnter();
        softAssert.assertFalse($(By.name("p")).getAttribute("value").contains("hello world 0"), "Hello world 3 assert");

        softAssert.assertAll();
    }
}
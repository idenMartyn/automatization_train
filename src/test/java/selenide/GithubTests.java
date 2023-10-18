package selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTests {

    @BeforeEach
    public void configuration() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com");
        $(byXpath(".//a[@href='/login']")).click();
        $(byName("login")).setValue("zadorin7zadorin@gmail.com");
        $(byName("password")).click();
        $(byName("password")).setValue("Zadorindanil25");
        $(byName("commit")).click();
    }

    @Test
    public void login() {}

    @Test
    public void logout() {
        $(byXpath(".//img[@class='avatar circle']")).click();
        $(byXpath(".//a[@href='/logout']")).click();
        $(byXpath(".//input[@value='Sign out']")).click();
    }

    @Test
    public void search() {
        $(byId("qb-input-query")).click();
        $(byId("query-builder-test")).setValue("test").pressEnter();
    }
}

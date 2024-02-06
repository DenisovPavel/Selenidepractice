package CreateSelenideThroughSelenium.sm2;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class AbstractTest {
    private static String login = "OOlega";

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    private static String password = "8b8ea6e167";

    @AfterAll
    static void tearDown() {
        Selenide.closeWebDriver();
    }

    @BeforeAll
    static void SetUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Selenide.open("https://test-stand.gb.ru/login");
        Configuration.pageLoadTimeout = 5000;
    }
}
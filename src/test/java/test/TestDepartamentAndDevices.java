package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestDepartamentAndDevices extends TestBase {
    @Test
    public void firstTest() {
        autorisation.goTo()
                .clickAutorisation()
                .checkPageIsCorrect();
    }
    @Test
    public void secondTest() {
    }
}



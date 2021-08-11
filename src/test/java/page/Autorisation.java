package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autorisation extends PageBase{
    String SITE_URL="http://localhost:8080/admin/login";
    public Autorisation(WebDriver driver) {
        super(driver);
    }

    public Autorisation goTo(){
        driver.get(SITE_URL);
        return this;
    }
    public Autorisation clickAutorisation(){
        click(By.id("admin_login__button--submit"));
        return this;
    }
    public Autorisation checkPageIsCorrect(){
        isElementDisplayed(By.id("admin_login__input--login"));
        return this;
    }

}

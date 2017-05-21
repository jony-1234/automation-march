package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#nav-wrapper .container #page-nav .nav-links .nav-links-wrapper .nav-left #sections .menu-icon svg:only-child")
    public static WebElement sectionsMenu;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(1)")
    public static WebElement sectionsMenuNews;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2)")
    public static WebElement sectionsMenuMetro;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(3)")
    public static WebElement sectionsMenuPageSix;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4)")
    public static WebElement sectionsMenuSports;

    public static WebElement getSectionsMenuWebElement() {
        return sectionsMenu;
    }
    public static WebElement getSectionsMenuNewsWebElement() {
        return sectionsMenuNews;
    }
    public static WebElement getSectionsMenu() {
        return sectionsMenu;
    }

    public static WebElement getSectionsMenuNews() {
        return sectionsMenuNews;
    }

    public static WebElement getSectionsMenuMetro() {
        return sectionsMenuMetro;
    }

    public static WebElement getSectionsMenuPageSix() {
        return sectionsMenuPageSix;
    }

    public static WebElement getSectionsMenuSports() {
        return sectionsMenuSports;
    }
    public static void clickOnSectionsMenu() {
        getSectionsMenuWebElement().click();
    }
    public static void clickOnNewsSection(){
        getSectionsMenuNewsWebElement().click();
    }
    public static void clickOnMetroSection(){
        getSectionsMenuMetro().click();
    }

    public static void clickOnSportsSection(){
        getSectionsMenuSports().click();
    }
    public static void goToNewsSection(){
        clickOnSectionsMenu();
        clickOnNewsSection();
    }
    public static void goToMetroSections(){
        clickOnSectionsMenu();
        clickOnMetroSection();
    }
}




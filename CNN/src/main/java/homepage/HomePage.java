package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by Md.Golam Robbani on 5/15/2017.
 */





public class HomePage extends CommonAPI {

    // @FindBy(how = How.CSS, using = "#fb-root .fb_reset #nav__plain-header .nav--plain-header jpadjustmargin jpaddcolortonav #menu .nav-menu js-navigation-hamburger div:only-child")
    //public static WebElement sectionsMenu;

    @FindBy(how = How.CSS, using = ".nav-menu-links li:nth-child(1)")
    public static WebElement sectionsUs;

    @FindBy(how = How.CSS, using = ".nav-menu-links li:nth-child(2)")
    public static WebElement sectionsMenuWorld;

    @FindBy(how = How.CSS, using = ".nav-menu-links li:nth-child(3)")
    public static WebElement sectionsMenuPolitics;

    @FindBy(how = How.CSS, using = ".nav-menu-links li:nth-child(4)")
    public static WebElement sectionsMenuOpinion;

    public static WebElement getsectionsMenuUs() {
        return getsectionsMenuUs();
    }

    public static WebElement getSectionsMenuWorld() {
        return getSectionsMenuWorld();
    }

    public static WebElement getSectionsMenuPolitics() {
        return getSectionsMenuPolitics();
    }
    public static WebElement getSectionsMenuOpinion() {
        return getsectionsMenuUs();
    }



    public  void goToSectionsMenuUs(){
        getsectionsMenuUs().click();
    }
    public  void goToSectionsMenuWorld(){
        getSectionsMenuWorld().click();
    }
    public  void goToSectionsMenuPolitics(){
        getSectionsMenuPolitics().click();
    }
    public  void goToSectionsMenuOpinion(){
        getSectionsMenuOpinion().click();
    }}



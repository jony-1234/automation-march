package cnntest;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/20/2017.
 */
public class CNNTest extends CommonAPI{

    @Test
    public void uspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToSectionsMenuUs();
    }

    @Test
    public void worldpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.goToSectionsMenuWorld();
    }
}


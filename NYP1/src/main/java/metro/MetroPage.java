package metro;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class MetroPage extends CommonAPI {

    public void metroPageNews(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToMetroSections();
    }
}
package metro;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class Metro extends CommonAPI {

    @Test
    public void metroNews(){
        MetroPage metroPage = PageFactory.initElements(driver, MetroPage.class);
        metroPage.metroPageNews();
    }
}
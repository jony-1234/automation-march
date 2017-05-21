package home;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Created by PIIT_NYA on 5/6/2017.
 */
public class TestAmazonHome extends CommonAPI {
    @Test
    public void amazonTitle() {
        String titleActual = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(titleActual, driver.getTitle());
        System.out.println(driver.getTitle());

    }
    @Test
    public void testDeal(){
        clickByCss(".nav-a") ;
}
}

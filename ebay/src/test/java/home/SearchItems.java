package home;

import base.CommonAPI;
import com.sun.corba.se.pept.transport.ContactInfo;
import org.testng.annotations.Test;

/**
 * Created by Md.Golam Robbani on 5/10/2017.
 */
public class SearchItems extends CommonAPI {

    @Test
    public void serach(){
        typeByCss("#gh-ac", "iphone");


    }
    @Test
    public void TestDeal(){
        clickByCss("#gh-ac");
    }
    @Test
    public void TestFashion(){
        typeByCss("#gh-ac","shirt");

    }
    @Test
    public void GiftCard(){
        clickByCss(".gh-p");
    }
    @Test
    public void HelpContactInfo(){
        clickByCss(".gh-p");

    }
}

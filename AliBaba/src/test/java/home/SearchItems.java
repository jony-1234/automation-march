package home;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Md.Golam Robbani on 5/12/2017.
 */
public class SearchItems extends CommonAPI{
    @Test
    public  void Search(){
        typeByCss(".ui-searchbar-keyword","SearchText");
    }
}

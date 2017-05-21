package news;

/**
 * Created by Md.Golam Robbani on 5/13/2017.
 */

        import base.CommonAPI;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class News extends CommonAPI {

    @Test
    public void headlineNews(){
        NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
        newsPage.clickOnHeadLine();
    }
}

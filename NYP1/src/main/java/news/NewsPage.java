package news;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class NewsPage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".postid-10943106")
    public static WebElement newsHeader;

    public static WebElement getNewsHeader() {
        return newsHeader;
    }

    public static void clickOnHeadLine(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToNewsSection();
        getNewsHeader().click();
    }
}
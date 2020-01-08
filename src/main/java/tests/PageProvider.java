package tests;

import org.openqa.selenium.support.PageFactory;
import pages.LoginSuccessfullyPage;
import pages.OpenAccountPage;
import runner.TestRunner;

public class PageProvider {

    private static OpenAccountPage openAccountPage;
    private static LoginSuccessfullyPage loginSuccessfullyPage;

    public static OpenAccountPage getOpenAccountPage() {
        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        }
        return openAccountPage;
    }

//    public static LoginSuccessfullyPage getloginSuccessfullyPage() {
//        if (loginSuccessfullyPage == null) {
//            loginSuccessfullyPage = PageFactory.initElements(TestRunner.driver, LoginSuccessfullyPage.class);
//        }
//        return loginSuccessfullyPage;
//    }






}

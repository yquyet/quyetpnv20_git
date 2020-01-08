package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {

    @FindBy(xpath = "//*[@id=\"userSelect\"]")
    WebElement clickChose;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/div/select/option[3]")
    WebElement clickChoseName;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/div/input")
    WebElement inputDeposit;

    public void chose(){
        this.clickChose.click();

    }


    public void choseName(){
        this.clickChoseName.click();

    }

    public void submitLogin(){
        btnLogin.click();
    }





}

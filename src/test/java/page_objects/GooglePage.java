package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Factory.DriverFactory;

public class GooglePage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    private WebElement searchLineLocator;

    public WebElement getSearchLineLocator() {
        return searchLineLocator;
    }

    @FindBy(xpath = "//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")
    private WebElement imageButton;

    public WebElement getImageButton() {
        return imageButton;
    }


    public GooglePage(WebDriver driver) throws Exception {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}

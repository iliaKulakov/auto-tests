package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Factory.DriverFactory;

public class GoogleImagePage {

    public WebElement getSearchImageLine() {
        return searchImageLine;
    }

    public WebElement getImageSearchButton() {
        return imageSearchButton;
    }

    public WebElement getScreenKeyboardButton() {
        return screenKeyboardButton;
    }

    public WebElement getVoiceSearch() {
        return voiceSearch;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getLoadImageButton() {
        return loadImageButton;
    }

    public WebElement getChooseTheFileButton() {
        return chooseTheFileButton;
    }

    public WebElement getCloseSearchWindowButton() {
        return closeSearchWindowButton;
    }

    @FindBy(xpath = "//*[@id=\"lst-ib\"]")
    private WebElement searchImageLine;

    @FindBy(xpath = "//*[@id=\"qbi\"]")
    private WebElement imageSearchButton;

    @FindBy(xpath = "//*[@id=\"gs_ok0\"]")
    private WebElement screenKeyboardButton;

    @FindBy(xpath = "//*[@id=\"gs_st0\"]/a[3]")
    private WebElement voiceSearch;

    @FindBy(xpath = "//*[@id=\"mKlEF\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"qbug\"]/div/a")
    private WebElement loadImageButton;

    @FindBy(xpath = "//*[@id=\"qbfile\"]")
    private WebElement chooseTheFileButton;

    @FindBy(xpath = "//*[@id=\"qbx\"]")
    private WebElement closeSearchWindowButton;

    public GoogleImagePage(WebDriver driver) throws Exception {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    }



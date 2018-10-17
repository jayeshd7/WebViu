package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[1]/div/div[1]/div[3]/a[1]")
    public WebElement movieIconUrl;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div[1]/button/span")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[1]/div/div[2]/div[1]/button/span")
    public WebElement searchEditBar;



    public void ClickMovieIcon()
    {
        movieIconUrl.click();
    }
    public void clickSearchButton(){searchButton.click();}
    public void sendMovieName(){searchEditBar.sendKeys("sarkar");}
    public void hitEnterKey(){searchEditBar.sendKeys(Keys.ENTER);}




}


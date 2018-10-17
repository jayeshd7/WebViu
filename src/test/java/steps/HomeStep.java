package steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;

public class HomeStep {

    private BaseUtil base;

    public HomeStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the viu url$")

    public void iNavigateToTheViuUrl() throws Throwable {
        System.out.println("Navigate Login Page");
        base.Driver.navigate().to("https://www.viu.com/ott/in/en/hindi");
    }

    @And("^click on movie icon$")
    public void clickOnMovieIcon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage(base.Driver);
        homePage.ClickMovieIcon();
    }

    @Then("^I should see the hindi movie page$")
    public void iShouldSeeTheHindiMoviePage() throws Throwable {
        Assert.assertEquals("Award-winning Films", base.Driver.findElement(By.className("c-header__title")).isDisplayed(), true);
    }

    @Given("^I click on the search button$")
    public void iClickOnTheSearchButton() throws Throwable {
        HomePage homePage = new HomePage(base.Driver);
        homePage.clickSearchButton();
    }

    @And("^write movie name sarkar$")
    public void writeMovieNameSarkar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage(base.Driver);
        homePage.sendMovieName();
    }

    @And("^hit the enter button$")
    public void hitTheEnterButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        HomePage homePage = new HomePage(base.Driver);
        homePage.hitEnterKey();
    }

    @Then("^I should see the sarkar movie page$")
    public void iShouldSeeTheSarkarMoviePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Sarkar", base.Driver.findElement(By.className("c-title title--md")).isDisplayed(), true);
    }
}

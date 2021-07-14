package Steps;

import PageObject.WebTablePageObject;
import Pages.WebTablePage;
import UI.WebTable;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import Serenity.WebTableSerenity;
import sun.security.krb5.Credentials;

import java.util.List;

public class WebTableStep  {
    WebTable ui;
    @Steps
    WebTablePage webTablePage;
    WebTableSerenity webTableSerenity;

    @Given("^Open home page$")
    public void openHomePage() {
        webTableSerenity.openHomePage();
    }

    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theWebsiteDisplayMemberinGridCorrectWithAnd(String firstName, String lastName) throws Throwable {
        Assert.assertEquals(webTablePage.getFirstName(), firstName);
        Assert.assertEquals(webTablePage.getLastName(), lastName);
    }

    @When("^Click on add button$")
    public void clickOnAddButton() {
        webTablePage.clickAddButton();
    }

    @Then("^The website display Form correct with \"([^\"]*)\"$")
    public void theWebsiteDisplayFormCorrectWith(String formName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(webTablePage.getFormName(), formName);

    }

    @And("^Enter data to all textfield$")
    public void enterDataToAllTextfield(DataTable usercredentials) {
        webTablePage.enterDataTC03(usercredentials);
    }

    @And("^Click submit button$")
    public void clickSubmitButton() {
        webTablePage.clickSubmitButton();
    }

//    @Then("^The website display Member in Grid correct with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void theWebsiteDisplayMemberInGridCorrectWithAndAndAndAndAnd(String fnamenew, String lnamenew, String agenew, String emailnew, String salarynew, String departmentnew) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals(webtableSerenity.getFirstNameNew(), fnamenew);
//        Assert.assertEquals(webtableSerenity.getLastNameNew(), lnamenew);
//        Assert.assertEquals(webtableSerenity.getAgeNew(), agenew);
//        Assert.assertEquals(webtableSerenity.getEmailNew(), emailnew);
//        Assert.assertEquals(webtableSerenity.getSalaryNew(), salarynew);
//        Assert.assertEquals(webtableSerenity.getDepartmentNew(), departmentnew);
//    }

    @And("^Enter invalid data in email textfield and valid data in required fields$")
    public void enterInvalidDataInEmailTextfieldAndValidDataInRequiredFields() {
        webTablePage.enterDataTC04();
    }


    @Then("^The website display warning at email textfield$")
    public void theWebsiteDisplayWarningAtEmailTextfield() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.emailInputColorCode());
    }

    @And("^Enter invalid data in age textfield and valid data in required fields$")
    public void enterInvalidDataInAgeTextfieldAndValidDataInRequiredFields() {
        webTablePage.enterDataTC05();
    }

    @Then("^The website display warning at age textfield$")
    public void theWebsiteDisplayWarningAtAgeTextfield() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.ageInputColorCode());
    }

    @And("^Enter valid data to all textfield$")
    public void enterValidDataToAllTextfield(List<WebTablePageObject>  usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            ui.firstnameinput.sendKeys(webtable.getFirstName());
            ui.lastnameinput.sendKeys(webtable.getLastName());
            ui.emailinput.sendKeys(webtable.getEmail());
            ui.ageinput.sendKeys(webtable.getAge());
            ui.salaryinput.sendKeys(webtable.getSalary());
            ui.departmentinput.sendKeys(webtable.getDepartment());
        }

    }

    @Then("^The website display Member in Grid correct$")
    public void theWebsiteDisplayMemberInGridCorrect(List<WebTablePageObject>  usercredentials) {
        for (WebTablePageObject webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstNameNew(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastNameNew(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAgeNew(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmailNew(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalaryNew(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartmentNew(), webtable.getDepartment());

        }

//    @Then("^The website display default Member in Grid correct$")
//    public void theWebsiteDisplayDefaultMemberInGridCorrect(DataTable usercredentials) {
//        List<List<String>> data = usercredentials.raw();
//        Assert.assertEquals(webtableSerenity.getFirstName(),data.get(0).get(0));
//        Assert.assertEquals(webtableSerenity.getLastName(),data.get(0).get(1));
//        Assert.assertEquals(webtableSerenity.getAge(),data.get(0).get(2));
//        Assert.assertEquals(webtableSerenity.getEmail(),data.get(0).get(3));
//        Assert.assertEquals(webtableSerenity.getSalary(),data.get(0).get(4));
//        Assert.assertEquals(webtableSerenity.getDepartment(),data.get(0).get(5));
//    }
    }
}

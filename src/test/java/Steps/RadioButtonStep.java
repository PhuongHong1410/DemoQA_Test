package Steps;

import Serenity.RadioButtonSerenity;
import Serenity.WebTableSerenity;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RadioButtonStep {

    @Steps
    RadioButtonSerenity radiobuttonSerenity;

    @Given("^Open radio button page$")
    public void openRadioButtonPage() {
        radiobuttonSerenity.openRadioButtonPage();
    }

    @When("^Click on \\[Yes\\] radio button$")
    public void clickOnYesRadioButton() {
        radiobuttonSerenity.clickYesRadioButton();
    }

    @Then("^The website display the selected value correctly  with \"([^\"]*)\"$")
    public void theWebsiteDisplayTheSelectedValueCorrectlyWith(String value) throws Throwable {
        Assert.assertEquals(radiobuttonSerenity.getValue(), value);

    }


}

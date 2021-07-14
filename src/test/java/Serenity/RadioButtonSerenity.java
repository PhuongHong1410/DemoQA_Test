package Serenity;

import Pages.RadioButtonPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RadioButtonSerenity extends ScenarioSteps {

    RadioButtonPage radiobtnpage;

    public void openRadioButtonPage() {
        radiobtnpage.open();
    }

    public void clickYesRadioButton() {
        radiobtnpage.clickYesRadioButton();
    }

    public String getValue() {
        return radiobtnpage.getValue();
    }
}

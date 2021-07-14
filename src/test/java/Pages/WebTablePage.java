package Pages;

import UI.WebTable;
import cucumber.api.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


import java.util.List;

@DefaultUrl("https://demoqa.com/webtables")
public class WebTablePage extends PageObject {

    WebTable ui;

    public void openHomePage(){
        open();
    }
    public String getFirstName() {
        return ui.firstName.getTextValue();
    }

    public String getLastName() {
        return ui.lastName.getTextValue();
    }

    public String getAge() {
        return ui.age.getTextValue();
    }

    public String getEmail() {
        return ui.email.getTextValue();
    }

    public String getSalary() {
        return ui.salary.getTextValue();
    }

    public String getDepartment() {
        return ui.department.getTextValue();
    }

    public String getFirstNameNew() {
        return ui.firstNameNew.getTextValue();
    }

    public String getLastNameNew() {
        return ui.lastNameNew.getTextValue();
    }

    public String getAgeNew() {
        return ui.ageNew.getTextValue();
    }

    public String getEmailNew() {
        return ui.emailNew.getTextValue();
    }

    public String getSalaryNew() {
        return ui.salaryNew.getTextValue();
    }

    public String getDepartmentNew() {
        return ui.departmentNew.getTextValue();
    }

    public void clickAddButton() {

        ui.add.click();
    }

    public String getFormName() {
        return ui.formName.getTextValue();
    }

    public void clickSubmitButton() {

        ui.submit.click();
    }

    public void enterDataTC03(DataTable usercredentials) {

        List<List<String>> data = usercredentials.raw();
            ui.firstnameinput.sendKeys(data.get(0).get(0));
            ui.lastnameinput.sendKeys(data.get(0).get(1));
            ui.emailinput.sendKeys(data.get(0).get(2));
            ui.ageinput.sendKeys(data.get(0).get(3));
            ui.salaryinput.sendKeys(data.get(0).get(4));
            ui.departmentinput.sendKeys(data.get(0).get(5));

    }

    public void enterDataTC04() {
        ui.firstnameinput.sendKeys("Phuong");
        ui.lastnameinput.sendKeys("Hong");
        ui.emailinput.sendKeys("phuong123");
        ui.ageinput.sendKeys("18");
        ui.salaryinput.sendKeys("2000000");
        ui.departmentinput.sendKeys("Tester Team");
    }

    public void enterDataTC05() {
        ui.firstnameinput.sendKeys("Phuong");
        ui.lastnameinput.sendKeys("Hong");
        ui.emailinput.sendKeys("phuong123@gmail.com");
        ui.ageinput.sendKeys("ag");
        ui.salaryinput.sendKeys("2000000");
        ui.departmentinput.sendKeys("Tester Team");
    }


    public String emailInputColorCode() {
        String colorCode = ui.emailinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String ageInputColorCode() {
        String colorCode = ui.ageinput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String expectedColorWhenFalse(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }
    public String expectedColorWhenTrue(){

        return "rgb(40, 167, 69)";
    }
}

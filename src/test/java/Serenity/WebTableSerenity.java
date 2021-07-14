
package Serenity;

        import cucumber.api.DataTable;
        import net.thucydides.core.steps.ScenarioSteps;
        import Pages.WebTablePage;

public class WebTableSerenity extends ScenarioSteps {
    WebTablePage webtablePage;

    public void openHomePage(){
        webtablePage.open();
    }
    public String getFirstName() {
        return webtablePage.getFirstName();
    }
    public String getLastName() {
        return webtablePage.getLastName();
    }
    public String getAge() {
        return webtablePage.getAge();
    }
    public String getEmail() {
        return webtablePage.getEmail();
    }
    public String getSalary() {
        return webtablePage.getSalary();
    }
    public String getDepartment() {
        return webtablePage.getDepartment();
    }
    public String getFirstNameNew() {
        return webtablePage.getFirstNameNew();
    }
    public String getLastNameNew() {
        return webtablePage.getLastNameNew();
    }
    public String getAgeNew() {
        return webtablePage.getAgeNew();
    }
    public String getEmailNew() {
        return webtablePage.getEmailNew();
    }
    public String getSalaryNew() {
        return webtablePage.getSalaryNew();
    }
    public String getDepartmentNew() {
        return webtablePage.getDepartmentNew();
    }
    public void clickAddButton(){
        webtablePage.clickAddButton();
    }
    public String getFormName() {
        return webtablePage.getFormName();
    }
    public void clickSubmitButton(){
        webtablePage.clickSubmitButton();
    }
    public void enterDataTC03(DataTable usercredentials){
        webtablePage.enterDataTC03(usercredentials);
    }
    public void enterDataTC04(){
        webtablePage.enterDataTC04();
    }
    public void enterDataTC05(){
        webtablePage.enterDataTC05();
    }
    public String emailInputColorCode(){

        return webtablePage.emailInputColorCode();
    }
    public String ageInputColorCode(){

        return webtablePage.ageInputColorCode();
    }

}

package PageObject;

import cucumber.api.DataTable;

import java.util.Map;

public class WebTablePageObject {
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String salary;
    private String department;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

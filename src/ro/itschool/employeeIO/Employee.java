package ro.itschool.employeeIO;

import java.io.Serializable;

public class Employee implements Serializable {
    private int cnp;
    private String name;
    private String firstname;
    private String position;


    public Employee(int cnp, String name, String firstname, String position) {
        this.cnp = cnp;
        this.name = name;
        this.firstname = firstname;
        this.position = position;
    }

    public int getCnp() {
        return cnp;
    }

    public void setCnp(int cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

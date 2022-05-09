package ro.itschool.catalog;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<RubricaAbsenta> rubricaAbsentas =  new ArrayList<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ArrayList<RubricaAbsenta> getRubricaAbsentas() {
        return rubricaAbsentas;
    }

    public void setRubricaAbsentas(ArrayList<RubricaAbsenta> rubricaAbsentas) {
        this.rubricaAbsentas = rubricaAbsentas;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void addRubrica(RubricaAbsenta rubricaAbsenta) {
        rubricaAbsentas.add(rubricaAbsenta);
    }
}
package ro.itschool.employeeIO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Employee employee = new Employee();
//        employee.setCnp(29437282);
//        employee.setNume("Catarov");
//        employee.setPrenume("Anca");
//        employee.setFunctie("Programator");
//        EmployeeService employeeService = new EmployeeService();
//        employeeService.addEmployee(employee);
//
//        employeeService.viewEmployees();
        EmployeeUI employeeUI = new EmployeeUI();
        employeeUI.startProgram();
    }
}

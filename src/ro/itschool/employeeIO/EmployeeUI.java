package ro.itschool.employeeIO;

import java.util.Scanner;

public class EmployeeUI {
    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int optiune;
        do{
            System.out.println("0.Exit.");
            System.out.println("1.Add employee.");
            System.out.println("2.View employees.");
            System.out.println("3.Delete an employee after cnp.");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if (optiune == 1) {
                System.out.println("Enter cnp of employee:");
                int cnp = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter last name of employee");
                String name = scanner.nextLine();
                System.out.println("Enter fist name of employee");
                String firstName = scanner.nextLine();
                System.out.println("Enter position of employee");
                String position = scanner.nextLine();

                Employee employee = new Employee(cnp,name,firstName,position);
                try {
                    employeeService.addEmployee(employee);
                } catch (InvalidLastNameException lastName){
                    System.out.println("Invalid last name!");
                } catch (InvalidFirstNameException ine){
                    System.out.println("Invalid First Name - you idiot !!");
                }
            }
            else if(optiune == 2){
                employeeService.viewEmployees();
            }
            else if(optiune == 3){
                System.out.println("Enter cnp of employee to remove: ");
                int cnp = scanner.nextInt();
                employeeService.deleteEmployee(cnp);
            }
        }while(optiune != 0);
    }

}

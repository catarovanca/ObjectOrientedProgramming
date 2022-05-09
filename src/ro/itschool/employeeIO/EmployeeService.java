package ro.itschool.employeeIO;

import java.util.List;

public class EmployeeService {

    private ObjectIO objectIO = new ObjectIO();

    public void addEmployee(Employee employee) throws InvalidFirstNameException {

//        ObjectIO objectIO = new ObjectIO();
        if(employee.getFirstname() == null || employee.getFirstname().isEmpty()) {
            InvalidLastNameException invalidLastNameException = new InvalidLastNameException();
            throw invalidLastNameException;
        }
        else if(employee.getFirstname() == null || employee.getFirstname().isEmpty()) {
            InvalidFirstNameException invalidFirstNameException = new InvalidFirstNameException();
            throw invalidFirstNameException;

    } else {
            List<Employee> existingEmployees = objectIO.readEmployee();
            existingEmployees.add(employee);
            objectIO.writeEmployee(existingEmployees);
        }
    }


    public void viewEmployees(){
//        ObjectIO objectIO = new ObjectIO();
        List<Employee> existingEmployees = objectIO.readEmployee();
        for (Employee employee : existingEmployees ){
            int cnp = employee.getCnp();
            String nume = employee.getName();
            String prenume = employee.getFirstname();
            String functie = employee.getPosition();
            System.out.println("Nume : " + nume + " " + prenume + " (" + functie + ") ");
        }
    }

    public void deleteEmployee(int cnp){
        List<Employee> existingEmployees = objectIO.readEmployee();
        int index = 0;
        for(Employee employee : existingEmployees){
            if(cnp == employee.getCnp())
            {
                existingEmployees.remove(index);
                break;
            }
            index++;
        }
        objectIO.writeEmployee(existingEmployees);
    }
}

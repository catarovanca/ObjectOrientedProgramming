package ro.itschool.employeeIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectIO {

    private String path = "/Users/catarovanca/Downloads/io/employees/angajati.txt";
//Citeste din fisier o lista de angajati si o returneaza.
    public List<Employee> readEmployee(){
        File file = new File(this.path);


        List<Employee> employees =  new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream);
            employees = (List<Employee>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No employees yet!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
//Scrie in fisier o lista de angajati.
    public void writeEmployee(List<Employee> employees){
        File file = new File(this.path);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

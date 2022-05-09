package ro.itschool.minishop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFileScanner<T> {

    public void writeToFile(String fileName, List<T> objects) {
        File file = new File(fileName);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objects);
            objectOutputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File not exist!");
        } catch (IOException e){
            System.out.println("Something is wrong!");
        }
    }
    public List<T> readFromFile(String fileName){
        File file = new File(fileName);
        List<T> objects = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objects = (List<T>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        } catch (IOException e) {
            System.out.println("Exception occured!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
        return objects;

    }
}

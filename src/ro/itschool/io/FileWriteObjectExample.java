package ro.itschool.io;

import java.io.*;

public class FileWriteObjectExample {
    public static void main(String[] args) {

        Computer computer = new Computer("MyPc",2);

        File file = new File("/Users/catarovanca/Downloads/io/computer.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(computer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}

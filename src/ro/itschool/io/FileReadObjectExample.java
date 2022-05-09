package ro.itschool.io;

import java.io.*;

public class FileReadObjectExample {
    public static void main(String[] args) {

                File file = new File("/Users/catarovanca/Downloads/io/example.txt");

                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                ObjectInputStream objectInputStream = null;
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Computer computer = null;
                try {
                    computer = (Computer) objectInputStream.readObject();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                System.out.println(computer.getName());
                System.out.println(computer.getRam());


            }
        }





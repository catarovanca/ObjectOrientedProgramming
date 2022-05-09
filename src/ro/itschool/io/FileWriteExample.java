package ro.itschool.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileWriteExample {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/catarovanca/Downloads/io/example2.txt");

        ArrayList<String> lines = new ArrayList<>();
        lines.add("Prima linie");
        lines.add("A doua linie");
        lines.add("A treia linie");

        try{
            Files.write(path,lines, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }


        Path pathDirectory = Paths.get("/Users/catarovanca/Downloads/io/mydyr");
        try{
            Files.createDirectories(pathDirectory);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}

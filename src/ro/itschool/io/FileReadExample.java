package ro.itschool.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadExample {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/catarovanca/Downloads/io/example.txt");

        try{
            List<String> lines = Files.readAllLines((path));
            for(String line : lines){
                System.out.println(line);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

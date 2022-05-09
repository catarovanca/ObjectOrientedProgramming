package ro.itschool.io;

import java.io.Serializable;
import java.util.PrimitiveIterator;

public class Computer implements Serializable {

    private String name;
    private int ram;

    public Computer(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

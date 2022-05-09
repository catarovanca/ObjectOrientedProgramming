package ro.itschool.mostenire;

public class Cerc extends FormaGeometrica {

    private int raza;

    public Cerc(double startX, double startY, String color) {
        super(startX, startY, color);
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}

package ro.itschool.constants;

public class Circle {

    public static double pi = 3.14;
    public int radius = 5;

    public Circle(int raza) {
        this.radius = raza;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return pi * radius * radius;
    }
}

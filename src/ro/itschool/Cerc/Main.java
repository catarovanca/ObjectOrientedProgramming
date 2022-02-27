package ro.itschool.Cerc;

public class Main {
    public static void main(String[] args) {

        Cerc circle1 = new Cerc();
        double area1 = circle1.areaCircle();
        System.out.println("Area of circle1 is: " + area1 + " !");
        Cerc circle2 = new Cerc(2.4);
        double area2 = circle2.areaCircle();
        System.out.println("Area of circle2 is: " + area2 + " !");
    }
}

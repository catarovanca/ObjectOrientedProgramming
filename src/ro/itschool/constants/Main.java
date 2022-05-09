package ro.itschool.constants;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(4);

        circle1.pi = 9;

        System.out.println(circle2.pi);
    }
}

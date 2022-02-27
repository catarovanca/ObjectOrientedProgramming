package ro.itschool.Dreptunghi;

public class Main {
    public static void main(String[] args) {

        Dreptunghi dreptunghi = new Dreptunghi();
        System.out.println("Area dreptunghiului este: " + dreptunghi.getArea());
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghi.getPerimeter());
        Dreptunghi dreptunghi1 = new Dreptunghi(5.7,7.8);
        System.out.println("Area dreptunghiului este: " + dreptunghi1.getArea());
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghi1.getPerimeter());




    }
}

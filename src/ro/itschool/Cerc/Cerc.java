package ro.itschool.Cerc;

public class Cerc {

    private double radius = 1;

    public Cerc(){

    }
    public Cerc(double radius){
        this.radius = radius;
    }
    public double areaCircle(){
        double area = 3.14 * Math.pow(this.radius,2);
        return area;
    }
}

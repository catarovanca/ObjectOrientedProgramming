package ro.itschool.Dreptunghi;

public class Dreptunghi {

    private double latime = 1;
    private double lungime = 1;

    public Dreptunghi(){

    }
    public Dreptunghi(double latime,double lungime){
        this.latime = latime;
        this.lungime = lungime;
    }
    public double getArea(){

        return (this.latime * this.lungime);
    }
    public double getPerimeter(){

        return (2 * (this.latime + this.lungime));
    }
}

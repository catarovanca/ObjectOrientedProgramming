package ro.itschool.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin1 = new Magazin("Profi");
        magazin1.deschidMagazin();
        magazin1.vinde();
        magazin1.inchidMagazin();
        magazin1.vinde();
    }
}

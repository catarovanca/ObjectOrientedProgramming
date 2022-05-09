package ro.itschool.mostenire.object;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(180);

        String rezultat = vehicle.toString();
        System.out.println("Rezultatul este: " + rezultat);

        //sau
        System.out.println("Rezultatul este : " + vehicle);
    }
}

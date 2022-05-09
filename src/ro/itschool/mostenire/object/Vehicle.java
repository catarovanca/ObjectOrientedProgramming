package ro.itschool.mostenire.object;

public class Vehicle {

    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString(){
        return "Vehicul cu viteza de: " + this.maxSpeed;
    }
}

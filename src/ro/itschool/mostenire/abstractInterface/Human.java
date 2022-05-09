package ro.itschool.mostenire.abstractInterface;

public class Human implements Being,Destroyer{
    @Override
    public void walk() {
        System.out.println("Walk,walk..");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void distroy() {

    }
}

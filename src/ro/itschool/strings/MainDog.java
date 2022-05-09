package ro.itschool.strings;

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max","Labrador");
        Dog dog2 = new Dog("Max","Labrador");
        Dog dog3 = dog1;

        if(dog1.equals(dog2)){
            System.out.println("Sunt la fel.");
        }
        if(dog1.equals(dog3)){
            System.out.println("Dog1 este la fel ca dog3.");
        }
        if(dog1.equals(dog2)){
            System.out.println("Dog1 este la fel ca dog2.");
        }
    }
}

package ro.itschool.Animal;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        Animal max = new Animal("Max","Negru",3);
        //max.animalDetails();
        System.out.println("Nume: " + max.getNume());
        max.manancGranule();
        max.doarme();
        max.joaca();
        max.latra();
    }
}

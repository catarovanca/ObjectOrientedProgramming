package ro.itschool.compozitie.zoo;

public class Zoo {

    private Animal[] animals = new Animal[5];

    public void addAnimal(int index,Animal animal){
        animals[index] = animal;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}

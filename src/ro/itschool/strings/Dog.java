package ro.itschool.strings;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
      return name.equals(dog.getName()) && breed.equals(dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }
}

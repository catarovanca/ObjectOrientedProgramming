package ro.itschool.compozitie.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int optiune = 0;
        do{
            System.out.println("0.Exit.");
            System.out.println("1.Add animal.");
            System.out.println("2.View animals.");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if(optiune == 1){
                System.out.println("Enter name of animal: ");
                String name = scanner.nextLine();
                System.out.println("Enter age of animal: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter position in the zoo (0-4): ");
                int index = scanner.nextInt();
                scanner.nextLine();
                Animal animal = new Animal(name, age);
                zoo.addAnimal(index, animal);
            }
            else if (optiune == 2){
                Animal[] animals = zoo.getAnimals();
                for (int i = 0; i < animals.length; i++){
                    System.out.print("[" + i + "]");
                    Animal animal = animals[i];
                    if( animal != null){
                        System.out.println(animal.getName());
                    } else {
                        System.out.println();
                    }
                }
            }

        }while (optiune != 0 );

    }
}

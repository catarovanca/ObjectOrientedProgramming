package ro.itschool;

public class Main {

    public static void main(String[] args) {

        House casaMea = new House("Anca's House");
        casaMea.color = "Verde";
        casaMea.numbersOfDoors = 10;

        System.out.println("Metrii patrati: " + casaMea.meters);

        House casaVecinului = new House("Mickey's house");
        casaVecinului.color = "Albastru";
        casaVecinului.numbersOfDoors = 12;

        User anca = new User("Catarov","Anca",27);
        User gabriel = new User("Ionescu","Gabriel",25);
        User maria = new User("Popescu","Maria");

        System.out.println("Varsta lui Maria " + maria.varsta);
        User anonim = new User();
        System.out.println("Nume user: " + anonim.nume + " " + anonim.prenume);


        Dressing Anca = new Dressing("Alb","Anca's dressing");
    }
}

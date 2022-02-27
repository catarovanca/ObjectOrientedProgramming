package ro.itschool.incapsulation;

public class Main {
    public static void main(String[] args) {
        // Un obiect calculator cu 4 procesoare 4gb rami si 256 GB hdd

        PC pculMeu = new PC();
        pculMeu.setCapacitateHDD(256);
        pculMeu.setMemorieRam(4);
        pculMeu.setNumarProcesoare(4);

        System.out.println("Pcul meu are " + pculMeu.getMemorieRam());


    }
}

package ro.itschool.generics.genericsbook;

public class MainString {
    public static void main(String[] args) {

        String nume = "Anca";
        String prenume = "Alex";

        Container<String> containerString = new Container<>(new String[10]);

        containerString.add(nume);
        containerString.add(prenume);

        String[] stringContined = containerString.getObjects();

    }
}

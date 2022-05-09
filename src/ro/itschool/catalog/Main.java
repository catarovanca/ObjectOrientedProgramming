package ro.itschool.catalog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Absenta> listaLuiIonescu = new ArrayList<>();
//
//
//        Materie geografie = new Materie("Geografie");
//        Materie romana = new Materie("Romana");
//
//        Student gabi = new Student("Gabriel", "Ionescu");
//        Student mihai = new Student("Alexandru", "Popescu");
//
//        Catalog catalog = new Catalog("Catalog XB");
//
//        Absenta absenta1 = new Absenta("12.03.2022");
//        Absenta absenta2 = new Absenta("11.03.2022");
//        Absenta absenta3 = new Absenta("11.03.2022");
//
//        RubricaAbsenta rubricaAbsenta = new RubricaAbsenta();
//        RubricaAbsenta rubricaAbsenta2 = new RubricaAbsenta();
//        RubricaAbsenta rubricaAbsenta3 = new RubricaAbsenta();
//        RubricaAbsenta rubricaAbsenta4 = new RubricaAbsenta();
//
//        rubricaAbsenta.setMaterie(geografie);
//        rubricaAbsenta2.setMaterie(romana);
//
//        rubricaAbsenta.addAbsenta(absenta1);
//        rubricaAbsenta.addAbsenta(absenta2);


        GestiuneCatalog gestiuneCatalog = new GestiuneCatalog();
        gestiuneCatalog.startGestiune();

    }
}
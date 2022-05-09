package ro.itschool.mostenire.gestiuneMagazin;

public class Fruit extends Product{


    public Fruit(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription(){
        return "Fructul este: " + getName() + " cu pretul de " + getPrice() + " lei.";
    }

    @Override
    public double calculateDiscount() {
        return 10 * getPrice() / 100;
    }
}


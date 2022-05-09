package ro.itschool.mostenire.gestiuneMagazin;

public class Tablets extends Product{

    private int displaySize;

    public Tablets(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Tablet with " + displaySize + " that costs" + getPrice();
    }

    @Override
    public double calculateDiscount() {
        return 20 * getPrice() / 100;
    }

}

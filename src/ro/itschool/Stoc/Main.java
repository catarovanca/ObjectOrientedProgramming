package ro.itschool.Stoc;

public class Main {
    public static void main(String[] args) {

        ro.itschool.Stock.Stock stoc = new ro.itschool.Stock.Stock("$","Meds");
        stoc.setClosingPrice(100);
        stoc.setCurrentPrice(125);
        double priceChanged = stoc.getChangePercent();
        System.out.println("The stock " + stoc.getStoc() + " has changed " + priceChanged + "%!");
    }

}

package ro.itschool.Stock;

public class Stock {

    private String simbol;
    private String numeStock;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol,String numeStock) {
        this.simbol = simbol;
        this.numeStock = numeStock;
    }
    public String getStoc(){
        String stoc = this.numeStock + this.simbol;
        return stoc;
    }
    public void setClosingPrice(double closingPrice){
        if(closingPrice > 0){
            this.closingPrice = closingPrice;
        }
    }
    public void setCurrentPrice(double currentPrice){
        if(currentPrice > 0){
            this.currentPrice = currentPrice;
        }
    }
    public double getChangePercent(){
        double changePrecent = ((this.currentPrice - this.closingPrice) / closingPrice) * 100;
        return changePrecent;
    }
}

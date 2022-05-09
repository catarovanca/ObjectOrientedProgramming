package ro.itschool.mostenire.gestiuneMagazin;

public class Clothes extends Product{


    private String brand;
    private String material;
    private int size;

    public Clothes(String name, double price) {
        super(name, price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {

        return this.getName() + " " + this.getBrand() + " fabric: " + this.getMaterial()
                + " size: " + this.getSize() + " ," + this.getPrice() + " lei";
    }

    @Override
    public String getDescription() {
        return "Cloth named: " + this.getName() + " from  brand " + this.getBrand() +
                " made from " + material;
    }

    @Override
    public double calculateDiscount() {
        return 5 * getPrice() / 100;
    }
}

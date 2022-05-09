package ro.itschool.mostenire.gestiuneMagazin;

public class Shop {

    private int lenght = 0;
    private String name;
    private Product[] products = new Product[20];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;

    }
    public void addProduct(Product product) {
        this.products[lenght] = product;
        lenght = lenght + 1;
    }
}

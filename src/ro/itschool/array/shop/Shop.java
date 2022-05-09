package ro.itschool.array.shop;

import java.util.ArrayList;

public class Shop {

//    private Product[] products = new Product[20];

    private ArrayList<Product> products = new ArrayList<>();


    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(int code){
        for (int i = 0; i < products.size(); i++){
            Product product = products.get(i);
            if(product.getCod() == code){
                products.remove(product);
            }
        }
    }
    public Product searchProduct(int code){
        Product productFound = null;
        for (int i = 0 ; i < products.size() ; i++){
            Product product = products.get(i);
            if(product.getCod() == code){
                productFound = product;
            }
        }
        return productFound;
    }
    public void displayProduct(){
        for(Product product : products){
            System.out.println(product);
        }
    }


}

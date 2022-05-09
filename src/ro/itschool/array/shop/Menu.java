package ro.itschool.array.shop;

import java.util.Scanner;

public class Menu {

    public void startProgram(){
        Scanner scanner = new Scanner(System.in);
        int optiune;
        Shop shop = new Shop();
        do{
            System.out.println("0.Exit.");
            System.out.println("1.Add product.");
            System.out.println("2.Remove product.");
            System.out.println("3.View products.");
            System.out.println("4.Search product by code.");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if(optiune == 1) {
                System.out.println("Enter product code: ");
                int productCode = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter product name: ");
                String productName = scanner.nextLine();
                System.out.println("Enter product description: ");
                String productDescription = scanner.nextLine();
                System.out.println("Enter product price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                Product product = new Product(productCode, productName,price);
                product.setDescription(productDescription);
                shop.addProduct(product);
            }
            if(optiune == 2){
                System.out.println("Enter code of product that will be deleted: ");
                int productCode = scanner.nextInt();
                scanner.nextLine();
                shop.removeProduct(productCode);
            }
            if(optiune == 3){
                shop.displayProduct();
            }
            if(optiune == 4){
                System.out.println("Enter code of product that will be searched: ");
                int productCode = scanner.nextInt();
                Product product = shop.searchProduct(productCode);
                if(product == null){
                    System.out.println("Product not found!");
                } else {
                    System.out.println(product);
                }
            }
        }while(optiune != 0);
    }
}

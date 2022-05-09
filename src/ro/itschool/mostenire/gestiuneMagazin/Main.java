package ro.itschool.mostenire.gestiuneMagazin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        shop.setName("Anca's shop");
        System.out.println("Welcome to " + shop.getName() + "!");

        int optiune;
        do{
            System.out.println("0.Exit");
            System.out.println("1.Add fruit.");
            System.out.println("2.Add clothes.");
            System.out.println("3.View products.");
            optiune = scanner.nextInt();
            scanner.nextLine();
            if(optiune == 1){
                System.out.println("Enter name of fruit: ");
                String name = scanner.nextLine();
                System.out.println("Enter price of fruit: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                Fruit fruit = new Fruit(name,price);
                shop.addProduct(fruit);
            }
            if (optiune == 2){
                System.out.println("Enter name of clothing product: ");
                String name = scanner.nextLine();
                System.out.println("Enter price of clothing product: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter brand name: ");
                String brand = scanner.nextLine();
                System.out.println("Enter product fabric: ");
                String fabric = scanner.nextLine();
                System.out.println("Enter size of product: ");
                int productSize = scanner.nextInt();
                scanner.nextLine();
                Clothes clothes = new Clothes(name,price);
                clothes.setBrand(brand);
                clothes.setMaterial(fabric);
                clothes.setSize(productSize);
                shop.addProduct(clothes);
            }
            if(optiune == 3){
                Product[] products = shop.getProducts();
                for(Product product: products) {
                    if (product != null) {
                        System.out.println(product);
                    }
                }
            }
        }while(optiune != 0);



    }
}

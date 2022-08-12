package com.company;

import java.util.Scanner;


public class Main {

    static void SetProductDetails() {
        Products Product = new Products();
        Scanner input = new Scanner(System.in);
        Category Category = new Category();
        //
        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("\t" + "Enter product details");
        System.out.println("*******************************");
        System.out.println("*******************************");
        while (true) {
            try {
                System.out.print("Enter Product Category: ");
                String category = input.next();
                category = category.toLowerCase();
                Product.productCategory(category);
                Category.addDetails(Product.getProductCategory());
                Category.addDetails(String.valueOf(Product.CreateId()));
                System.out.print("Enter Product Name : ");
                String name = input.next();
                Product.setProductName(name);
                Category.addDetails(Product.getProductName());
                System.out.print("Enter Product Brand : ");
                String brand = input.next();
                Product.setProductBrand(brand);
                Category.addDetails(Product.getProductBrand());
                System.out.print("Enter Product Quantity: ");
                int quantity = input.nextInt();
                Product.setQuantity(quantity);
                Category.addDetails(String.valueOf(Product.getQuantity()));
                System.out.print("Enter Product Buying Price : ");
                int bprice = input.nextInt();
                Product.setBuyingPrice(bprice);
                Category.addDetails(String.valueOf(Product.getBuyingPrice()));
                System.out.print("Enter Product Selling Price : ");
                int sprice = input.nextInt();
                Product.setSellingPrice(sprice);
                Category.addDetails(String.valueOf(Product.getSellingPrice()));
                Category.addDetails(String.valueOf(Product.Date()));
                System.out.print("Do you want to continue adding to the inventory? yes/no : ");
                String confirm = input.next();
                confirm=confirm.toLowerCase();
                if (confirm.equals("no")) {
                    System.out.print("Thank you for adding to the inventory");
                    break;
                }

            } catch (Exception error) {
                System.out.println("Invalid input!!! please try again");
            }
        }
        System.out.println("*******************************");
        System.out.println("*******************************");
        System.out.println("\t" + "Product details");
        System.out.println(Category.print());

    }


    public static void main(String[] args) {
        // write your code here
        SetProductDetails();
    }
}

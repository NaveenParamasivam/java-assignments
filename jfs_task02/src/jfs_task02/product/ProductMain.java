package jfs_task02.product;

import java.util.Scanner;

public class ProductMain {
   static   double totalAmount(Product[] products){
       double totalAmountSpend = 0;
           for(Product product:products){
               double totalAmountOfSingleProduct = product.quantity * product.price;
               System.out.println("Total Amount Spend On "+product.pid+"'st Product: "+totalAmountOfSingleProduct);
               totalAmountSpend +=totalAmountOfSingleProduct;
           }
           return totalAmountSpend;

    }
    public static void main(String[] args){

        Product[] products = new Product[5];

        Scanner getInput = new Scanner(System.in);

        for (int i=0;i<products.length;i++){
            int id=i+1;
            System.out.println("Enter Quantity Of "+id+"'s Product");
            int quantity=getInput.nextInt();
            System.out.println("Enter Price Of "+id+"'s Product");
            double price=getInput.nextDouble();

            products[i]=new Product(id,quantity,price);

        }


       for(Product product :products){
           product.displayProductDetails();

       }

        double highestPrice= products[0].price;
        int pId =  products[0].pid;
        for (Product product : products) {

            if(product.price > highestPrice){
                highestPrice = product.price;
                pId=product.pid;
            }

        }
        System.out.println("Id of product with highest price: "+ pId+" with price: "+highestPrice);

       double amount= totalAmount(products);
        System.out.println("Total Amount Spend On All Products: "+amount);


    }
}

package jfs_task02.product;

public class Product {
    int pid=0;
    int quantity=0;
    double price = 0.0;

    Product(int pid,int quantity,double price){
       this.pid = pid;
       this.quantity=quantity;
       this.price = price;
    }

    public void displayProductDetails(){
        System.out.print("Product Detail\nID: "+this.pid+"\nQuantity: "+this.quantity+"\nPrice: "+this.price+"\n\n");
    }
}

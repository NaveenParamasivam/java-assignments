package taxcalculator;

public class Product implements Taxable {
    int pID;
    double price;
    int quantity;
    Product(int pID,double price,int quantity){
        this.pID = pID;
        this.price = price;
        this.quantity = quantity;
    }
    public double calcTax(){
        double taxAmountPerProduct = Taxable.salesTax * this.price;
        return taxAmountPerProduct * quantity;
    }
}

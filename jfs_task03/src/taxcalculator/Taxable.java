package taxcalculator;

public interface Taxable {
     double salesTax = 0.07;
     double incomeTax = 0.105;
    abstract public double calcTax();
}

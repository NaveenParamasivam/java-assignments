package taxcalculator;

public class Employee implements Taxable {
    int empId;
    String name;
    double salary;
    Employee(int empId,String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    // salary is considered as monthly salary
    public double calcTax(){
        double perMonthTax = Taxable.incomeTax * this.salary;
        return perMonthTax * 12;
    }

}

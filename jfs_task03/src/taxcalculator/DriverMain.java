package taxcalculator;

import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args){

        Scanner getInput = new Scanner(System.in);


        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Sales Tax");
            System.out.println("2. Income Tax");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = getInput.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Product ID: ");
                    int pid = getInput.nextInt();
                    int quantity;
                    do {
                        System.out.print("Enter Quantity(Positive Values only): ");
                        quantity = getInput.nextInt();
                    } while (quantity <= 0);

                    double price;
                    do {
                        System.out.print("Enter Price(Positive Values only): ");
                        price = getInput.nextDouble();
                    } while (price <= 0);
                    Taxable product = new Product(pid,price,quantity);
                    double salesTax = product.calcTax();
                    System.out.printf("Sales Tax: ₹%.2f%n", salesTax);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    int empId = getInput.nextInt();
                    getInput.nextLine();
                    System.out.print("Enter Name: ");
                    String name = getInput.nextLine();
                    double salary;
                    do {
                        System.out.print("Enter Monthly Salary (Positive Values only): ");
                        salary = getInput.nextDouble();
                    } while (salary <= 0);

                    Taxable employee = new Employee(empId,name,salary);
                    double incomeTax = employee.calcTax();
                    System.out.printf("Income Tax (Yearly): ₹%.2f%n", incomeTax);
                    break;
                case 3:
                    System.out.println("Exiting the system");
                    getInput.close();
                    return;
                default:
                    System.out.println("Enter Valid Choice");
            }

        }
    }
}

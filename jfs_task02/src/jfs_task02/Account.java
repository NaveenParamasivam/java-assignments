package jfs_task02;

import java.util.Scanner;

public class Account {
    private double balance;
    public Account(){
        this.balance = 0.0;
    }
   public Account(double balance){
        if(balance>=0){
            this.balance = balance;

        }
    }
    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("You Deposited: "+depositAmount+"\nRemaining Balance: "+this.balance+".");


    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount>this.balance){
            System.out.print("You don't have sufficient balance to withdraw\nYour Current Balance is: "+this.balance+".\n");
        }else {
            this.balance = this.balance - withdrawAmount;
            System.out.println("You withdrawn: "+withdrawAmount+"\nRemaining Balance: "+this.balance+".");
        }


    }
    public void displayBalance(){
        System.out.println("Current Balance: "+this.balance);
    }
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        Account acc = new Account(0.0);
        double depositAmount;
        do {
            System.out.println("Enter Amount You Want To Deposit");
            depositAmount = getInput.nextDouble();

            if (depositAmount <= 0) {
                System.out.println("Negative or Zero Value is Not Acceptable");
            }
        } while (depositAmount <= 0);

        acc.deposit(depositAmount);

        double withdrawAmount;
        do {
            System.out.println("Enter Amount You Want To Withdraw");
            withdrawAmount = getInput.nextDouble();

            if (withdrawAmount <= 0) {
                System.out.println("Negative or Zero Value is Not Acceptable");
            }
        } while (withdrawAmount <= 0);

        acc.withdraw(withdrawAmount);
        acc.displayBalance();
    }
}

//4. Write a Java programming to create a banking system with three classes - Bank,
// Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and
// methods for adding them. Accounts should be an interface with methods to deposit, withdraw
// calculate interest, and view balances. SavingsAccount and CurrentAccount should implement
// the Account interface and have their own unique methods.
package Interfaces;

import java.util.Scanner;

interface Accounts{
    void deposit(double amount);
    void display();
    double calculate();
    void withdraw(double amount);
}
class Bank implements Accounts{
    static Scanner sc=new Scanner(System.in);
    double amount=0;
    double rate=0.06;
    String name;
    Bank(String name,double balance){
        this.name=name;
        this.amount=balance;
    }
    @Override
    public void deposit(double amount) {
         this.amount+=amount;
    }
    @Override
    public void withdraw(double amount) {
        this.amount-=amount;
    }

    @Override
    public void display() {
        System.out.println(this.amount);
    }

    @Override
    public double calculate() {
        return this.amount*rate;
    }
}
class SavingsAccount extends Bank{
    SavingsAccount(String name,double balance){
        super(name,balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public double calculate() {
        return super.calculate();
    }
}
class CurrentAccount extends Bank{
    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public double calculate() {
        return super.calculate();
    }
}
public class Program4 {
    public static void main(String[] args) {
        System.out.println("what type of account u want");
        System.out.println("1.Savings 2.Current");
       Scanner sc=new Scanner(System.in);
       SavingsAccount s;
       CurrentAccount c;
       int choice=sc.nextInt();
        if(choice==1){
            System.out.println("enter name");
            String name=sc.nextLine();
            double balance=sc.nextDouble();
            s=new SavingsAccount(name,balance);
        }
        else {
            System.out.println("enter name");
            String name=sc.nextLine();
            double balance=sc.nextDouble();
            c=new CurrentAccount(name,balance);
        }
        
    }
}
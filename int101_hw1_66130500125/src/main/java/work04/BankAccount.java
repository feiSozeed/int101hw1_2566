/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author feoy1
 */
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;
    //constuctor
    public BankAccount(int number,Person owner) {
        this.number = number;
        this.owner = owner;
    }
    //getter 
    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }
    
    public double withdraw(double amount){
        this.balance -= amount;
        return this.balance;
    }
    public void tranfer(double amout,BankAccount acc){
        withdraw(amout);
        acc.deposit(amout);
    }
    // toString
    @Override
    public String toString() {
        return "BankAccount{" +owner+" Number = "+this.number+ "}";
    }
     
            
}

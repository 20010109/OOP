/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author User
 */
public class accProperties {
    private double currentBalance;
    private double availableBalance;
    private String accountName;
    private int accountNumber;
    
    public accProperties(){
        
    }

    public accProperties(double currentBalance, double availableBalance, String accountName, int accountNumber) {
        this.currentBalance = currentBalance;
        this.availableBalance = availableBalance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    
    public boolean deposit(double amount){
        if(amount > 50){
            this.availableBalance += amount;
            //this.currentBalance += amount;
            System.out.println("Deposit Success!");
            return true;
        }else{
            System.out.println("Deposit Failed!");
            return false;
        }
    }
    
    public boolean withdraw(double amount){
        if(amount > 100){
            this.availableBalance -= amount;
            System.out.println("Withdrawal Success!");
            return true;
        }else{
            System.out.println("Withdrawal Failed!");
            return false;
        }
    }
    
    public double checkBalance(){
        return this.availableBalance;
    }
    
    public boolean transfer(accProperties a, double amount){
        a.availableBalance += amount;
        this.availableBalance -= amount;
        System.out.println("Transfer successful to " + a.accountName);
        return true;
    }
    
    public void display(){
        
        System.out.println(this.toString());
        System.out.println("\n");
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Account Name: " + accountName + "\nAccount Number: " + accountNumber + "\nCurrent Balance: " + currentBalance + "\nAvailable Balance: " + availableBalance;
    }
    
    
    
    
   
}

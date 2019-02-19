package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account() {
        this("56780", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Not possible. Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal complete. Remaining balance " + this.balance);
        }
    }


}

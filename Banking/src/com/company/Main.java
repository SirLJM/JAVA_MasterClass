package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("ING");

        bank.addBranch("Katowice");
        bank.addCustomer("Katowice", "Luk", 50.55);
        bank.addCustomer("Katowice", "Alex", 150.6);
        bank.addCustomer("Katowice", "Bool", 550.90);

        bank.addBranch("Gliwice");
        bank.addCustomer("Gliwice", "Bob", 44.22);

        bank.addCustomerTransaction("Katowice", "Luk", 44.22);
        bank.addCustomerTransaction("Katowice", "Luk", 12.44);
        bank.addCustomerTransaction("Katowice", "Alex", 1.65);

        bank.listCustomers("Katowice", true);
        bank.listCustomers("Gliwice", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Katowice")) {
            System.out.println("Error - branch already exists");
        }

        if (!bank.addCustomerTransaction("Katowice", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Katowice", "Luk", 12.22)) {
            System.out.println("Customer already exists");
        }
    }
}

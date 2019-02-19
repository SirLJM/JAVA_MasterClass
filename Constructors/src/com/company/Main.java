package com.company;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("12345", 200.00, "John Doe", "john@gmail.com", "+48 510050000");
        Account bobAccount = new Account();
        account.withdraw(1000);
        account.deposit(801);
        account.withdraw(1000);
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());

        Account timsAccount = new Account("Tim", "tim@gmial.com", "1232345");
        System.out.println(timsAccount.getCustomerName() + " " + timsAccount.getBalance());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName() + vipCustomer.getCreditLimit() + vipCustomer.getEmail());

        VipCustomer vipCustomer1 = new VipCustomer("Mark J", 200.00);
        System.out.println(vipCustomer1.getName() + vipCustomer1.getEmail());
        
    }
}

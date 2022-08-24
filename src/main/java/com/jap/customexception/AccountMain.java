package com.jap.customexception;

public class AccountMain {
    public static void main(String[] args) throws InsufficientFundException {
        Account account = new Account(5000);
        System.out.println("Account Balance = "+account.getAccountBalance());
        System.out.println("New Balance  = "+account.withdraw(500));
    }
}

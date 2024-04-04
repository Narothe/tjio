package org.example;

public class ATM implements ATMInterface {
    private double accountBalance;

    public ATM(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    @Override
    public double checkBalance(int pin) throws InvalidPinException {
        System.out.println("\ncheckBalance:");
        if (pin != 1234) {
            throw new InvalidPinException("Invalid PIN");
        }
        System.out.println("Checking balance: " + accountBalance);
        return accountBalance;
    }

    @Override
    public double deposit(int pin, double amount) throws InvalidPinException {
        System.out.println("\ndeposit:");
        if (pin != 1234) {
            throw new InvalidPinException("Invalid PIN");
        }
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        accountBalance += amount;
        System.out.println("Adding amount: " + amount);
        System.out.println("Current balance: " + accountBalance);
        return accountBalance;
    }

    @Override
    public double withdraw(int pin, double amount) throws InsufficientFundsException, InvalidPinException {
        System.out.println("\nwithdraw:");
        if (pin != 1234) {
            throw new InvalidPinException("Invalid PIN");
        }
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > 100.0) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        accountBalance -= amount;
        System.out.println("Draw amount: " + amount);
        System.out.println("Current balance: " + accountBalance);
        return accountBalance;
    }
}

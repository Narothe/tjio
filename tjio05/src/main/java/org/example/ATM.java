package org.example;

public class ATM implements ATMInterface {


    @Override
    public double checkBalance(int pin) throws InvalidPinException {
        if (pin != 1234) {
            throw new InvalidPinException("Invalid PIN");
        }
        return 100.0;
    }

    @Override
    public double deposit(int pin, double amount) throws InvalidPinException {
        return 0;
    }

    @Override
    public double withdraw(int pin, double amount) throws InsufficientFundsException, InvalidPinException {
        return 0;
    }
}

package org.example

import spock.lang.Specification

class ATMSpecification extends Specification {
    def "check balance"(int pin, double initialBalance, double result) {
        println "Running 'check balance' test"
        given:
        def atm = new ATM(initialBalance)

        expect:
        atm.checkBalance(pin) == result

        where:
        pin | initialBalance | result
        1234 | 500.0 | 500.0
    }
    def "deposit funds on your account"(int pin, double amount, double initialBalance, double result) {
        println "\n\nRunning 'deposit funds on your account' test"
        given:
        def atm = new ATM(initialBalance)
            atm.checkBalance(pin)

        when:
            atm.deposit(pin, amount)

        then:
            atm.checkBalance(pin) == result

        where:
            pin | amount | initialBalance | result
            1234 | 100.0 | 500.0 | 600.0
    }
    def "withdraw funds from your account"(int pin, double amount, double initialBalance, double result) {
        println "\n\nRunning 'withdraw funds from your account' test"
        given:
            def atm = new ATM(initialBalance)
            atm.checkBalance(pin)

        when:
            atm.withdraw(pin, amount)

        then:
            atm.checkBalance(pin) == result

        where:
            pin | amount | initialBalance | result
            1234 | 100.0 | 500.0 | 400.0
    }
}

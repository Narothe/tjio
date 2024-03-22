package org.example

import spock.lang.Specification

class ATMSpecification extends Specification {
    def "check balance"(int pin, double result) {
        expect:
            new ATM().checkBalance(pin) == result

        where:
            pin | result
            1234 | 100.0
    }
    def "deposit funds on your account"(int pin, double amount, double result) {
        given:
            def atm = new ATM()
            atm.checkBalance(pin)

        when:
            atm.deposit(pin, amount)

        then:
            atm.checkBalance(pin) == result

        where:
            pin | amount | result
            1234 | 50.0 | 150.0
    }
}
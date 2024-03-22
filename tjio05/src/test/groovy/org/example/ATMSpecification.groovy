package org.example

import spock.lang.Specification

class ATMSpecification extends Specification {
    def "check balance"(int pin, double result) {
        expect:
            new ATM().checkBalance(pin) == result

        where:
            pin | result
            1234 | 100.0
//            4321 | 200.0
//            1111 | 300.0

    }
}
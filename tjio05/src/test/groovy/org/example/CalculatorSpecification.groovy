package org.example

import spock.lang.Specification

class CalculatorSpecification extends Specification {
    def "one plus two should equal three"() {
        given: "Prepare two variables 'one' and 'two'"
            def calculator = new Calculator()
            def one = 1.0
            def two = 2.0

        when: "Try add two values one = 1 and two = 2"
            def result = calculator.add(one, two)

        then: "The result of addition is 3"
            result.toDouble() == 3.0
    }

    def "two minus one should equal one"() {
        given: "Prepare two variables 'one' and 'two'"
            def calculator = new Calculator()
            def one = 1.0
            def two = 2.0

        when: "Try subtract two values one = 1 and two = 2"
            def result = calculator.sub(two, one)

        then: "The result of subtraction is 1"
            result.toDouble() == 1.0
    }

    def "two times three should equal six"() {
        given: "Prepare two variables 'two' and 'three'"
            def calculator = new Calculator()
            def two = 2.0
            def three = 3.0

        when: "Try multiply two values two = 2 and three = 3"
            def result = calculator.mul(two, three)

        then: "The result of multiplication is 6"
            result.toDouble() == 6.0
    }

    def "six divided by two should equal three"() {
        given: "Prepare two variables 'six' and 'two'"
            def calculator = new Calculator()
            def six = 6.0
            def two = 2.0

        when: "Try divide two values six = 6 and two = 2"
            def result = calculator.div(six, two)

        then: "The result of division is 3"
            result.toDouble() == 3.0
    }

//    def "six divided by zero should thrown error"() {
//        given: "Prepare two variables 'six' and 'zero'"
//        def calculator = new Calculator()
//        def six = 6.0
//        def two = 0.0
//
//        when: "Try divide two values six = 6 and zero = 0"
//        def result = calculator.div(six, two)
//
//        then: "The result of division is error"
//        result.toDouble() == 3.0
//    }

}
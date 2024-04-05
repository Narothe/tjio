package org.example

import spock.lang.Specification

class CounterSpySpec extends Specification {
    def "Test countCharacters() method using Spy"(){
        given:
            def spyOperation = Spy(OperationImpl)
            def calcForSpy = new Counter(spyOperation)

            spyOperation.count("1") >> 1 // == stubOperation.count("1") {return 1}

        when:
            def resultSpy = calcForSpy.countCharacters("1")

        then:
            1 * spyOperation.count("1") // how many times method called
            resultSpy == 1 // check value
    }
}

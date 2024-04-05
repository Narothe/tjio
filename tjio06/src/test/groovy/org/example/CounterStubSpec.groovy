package org.example

import spock.lang.Specification

class CounterStubSpec extends Specification {
    def "Test countCharacters() method using Stub"() {
        given:
            def stubOperation = Stub(Operation)
            def calcForStub = new Counter(stubOperation)

            stubOperation.count("123") >> 3 // = stubOperation.count("123") {return 3}

        when:
            def resultStub = calcForStub.countCharacters("123")

        then:
            resultStub == 3 // check value
    }
}

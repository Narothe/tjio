package org.example

import spock.lang.Specification

class CounterMockSpec extends Specification {

    def "Test countCharacters() method using Mock"() {
        given:
            def mockOperation = Mock(Operation)
            def calcForMock = new Counter(mockOperation)

        when:
            calcForMock.countCharacters("123")

        then:
         1 * mockOperation.count("123") // how many times method called
    }
}
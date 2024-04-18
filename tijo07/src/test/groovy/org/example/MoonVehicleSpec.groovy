package org.example

import spock.lang.Specification

class MoonVehicleSpec extends Specification {
    def "Lunar rover movement test"() {
        expect:
        new LunarRover(startX, startY).move(direction, fields) == expectedPosition

        println("\n\nRunning 'Lunar rover movement test' test\n")
        println("Direction: $direction")
        println("Fields: $fields")
        println("Expected position: $expectedPosition")

        where:
        startX | startY | direction | fields | expectedPosition
        0      | 0      | 'forward' | 5      | 5
        0      | 0      | 'forward' | 10     | 10
        0      | 0      | 'backward'| 3      | -3
        0      | 0      | 'backward'| 7      | -7
    }

    def "Lunar rover rotation test"() {
        expect:
        new LunarRover(startX, startY).rotate(direction) == expectedPosition

        println("\n\nRunning 'Lunar rover rotation test' test\n")
        println("Direction: $direction")
        println("Expected position after rotation: $expectedPosition")

        where:
        startX | startY | direction | expectedPosition
        0      | 0      | 'left'    | 'no traditional turning mechanism'
        0      | 0      | 'right'   | 'no traditional turning mechanism'
    }

    def "Lunar rover rotation around own axis test"() {
        expect:
        new LunarRover(startX, startY).rotateAroundOwnAxis(direction) == expectedPosition

        println("\n\nRunning 'Lunar rover rotation around own axis test' test\n")
        println("Direction: $direction")
        println("Expected position after rotation: $expectedPosition")

        where:
        startX | startY | direction | expectedPosition
        0      | 0      | 'left'    | -90
        0      | 0      | 'right'   | 90
    }

    def "Lunar rover reset position test"() {
        given:
        def rover = new LunarRover(startX, startY)
        rover.move('forward', 10) // Przesunięcie pojazdu z pozycji startowej

        when:
        rover.resetPosition()

        then:
        rover.getPositionX() == startX
        rover.getPositionY() == startY

        println("\n\nRunning 'Lunar rover reset position test' test\n")
        println("Expected position after reset: ($startX, $startY)")

        where:
        startX | startY
        0      | 0
        3      | -5
        // Dodaj więcej punktów startowych według potrzeb
    }
}


package org.example

import spock.lang.Specification

class LotterySpec extends Specification {
    def "Test findDuplicateSets method"() {
        expect:
        def lottery = new LotteryImpl()
        List<Integer> duplicates = lottery.findDuplicateSets(nums, setSize)

        print("\n\nRunning 'Test findDuplicateSets method' test\n")
        print("Found duplicates: $duplicates\n")
        duplicates.size() == expectedSize
        duplicates == expectedDuplicate // Używamy operatora spread (*)

        where:
        nums                     | setSize | expectedSize | expectedDuplicate
        [1, 1, 3, 2, 2, 2, 4, 5] | 2       | 1            | [1]
        [1, 1, 3, 2, 2, 2, 4, 5] | 3       | 1            | [2]
     [1, 2, 2, 2, 3, 4, 5, 5, 1] | 2       | 2            | [1, 5]
        null                     | 1       | 0            | []
        [1, 2, 3]                | null    | 0            | []
        null                     | null    | 0            | []
        [1, 1, 2, 2, 2, 3, 4, 5] | 7       | 0            | []
    }
}

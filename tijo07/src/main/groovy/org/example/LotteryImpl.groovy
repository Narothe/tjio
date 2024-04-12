package org.example

class LotteryImpl implements Lottery {

    @Override
    List<Integer> findDuplicateSets(List<Integer> nums, Integer setSize) {
        if (setSize == null) {
            return List.of()
        }

        List<Integer> result = []
        Map<Integer, Integer> frequencyMap = [:]

        // Liczenie częstotliwości występowania elementów
        nums.each { num ->
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }

        // Dodawanie elementów, które mają odpowiednią częstotliwość do wyniku
        frequencyMap.each { num, freq ->
            if (freq == setSize) {
                result.add(num)
            }
        }

        return result
    }
}

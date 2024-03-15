public class Tables {

    Integer max(Integer[] digits) {
        if(digits == null || digits.length == 0) {
            return null;
        }

        Integer max = digits[0];
        for (Integer digit : digits) {
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }
}
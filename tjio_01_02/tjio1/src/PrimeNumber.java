public class PrimeNumber {
    public static Boolean isPrime(Integer digit) {
        if (digit == null) {
            return null;
        }
        if (digit <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0) {
                return false;
            }
        }

        return true;
    }
}

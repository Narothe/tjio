public class PrimeNumberTests {
    PrimeNumber primeNumber = new PrimeNumber();
    void primeNull() {
        // Arrange
        Integer digit = null;

        // Act
        Boolean result = primeNumber.isPrime(digit);

        // Assert
        assert result == null : "Test should get null";
    }
    void primeNegative() {
        // Arrange
        Integer digit = -10;

        // Act
        Boolean result = primeNumber.isPrime(digit);

        // Assert
        assert result == false : "Test should get false";
    }

    void primeZero() {
        // Arrange
        Integer digit = 0;

        // Act
        Boolean result = primeNumber.isPrime(digit);

        // Assert
        assert result == false : "Test should get false";
    }

    void primePositive() {
        // Arrange
        Integer digit = 1;

        // Act
        Boolean result = primeNumber.isPrime(digit);

        // Assert
        assert result == false : "Test should get false";
    }

    void primePositivePrime(Integer digit) {
        // Arrange

        // Act
        Boolean result = primeNumber.isPrime(digit);

        // Assert
        assert result == true : "Test should get true";
    }
}

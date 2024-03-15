public class TablesTests {
    Tables tables = new Tables();
    void tablesNull() {
        // Given
        Integer[] input = null;

        // When
        Integer result = tables.max(input);

        //Then
        assert result == null : "Test max(null) should get null";
    }

    void tablesEmpty() {
        // Given
        Integer[] input = new Integer[]{};

        // When
        Integer result = tables.max(input);

        //Then
        assert result == null : "Test max(empty array) should get null";
    }

    void tablesOneDigit() {
        // Given
        Integer[] input = new Integer[]{1};

        // When
        Integer result = tables.max(input);

        //Then
        assert result == 1 : "Test max([1])) should get 1";
    }

    void tablesMaxDigit() {
        // Given
        Integer[] input = new Integer[]{1,2,3};

        // When
        Integer result = tables.max(input);

        //Then
        assert result == 3 : "Test max([1,2,3])) should get 3";
    }
}

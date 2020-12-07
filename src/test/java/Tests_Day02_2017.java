import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class Tests_Day02_2017 {


    @ParameterizedTest
    @CsvSource({("5 1 9 5, 8"), ("7 5 3, 4,"), ("2 4 6 8, 6")})
    public void CanCalculateDifferenceBetweenMaxAndMinInRow(String test_input, int expected) {
        assertEquals(expected, Day02_2017.difference(test_input));
    }

    @Test
    public void CanCalculateChecksumCorrectly() {
        assertEquals(18, Day02_2017.checksum("5 1 9 5", "7 5 3", "2 4 6 8"));
    }

    @ParameterizedTest
    @CsvSource({("5 9 2 8, 4"), ("9 4 7 3, 3"), ("3 8 6 5, 2")})
    public void test_CanFindTheOnlyEvenlyDivisiblePairAndReturnDivisionResult(String test_input, int expected) {
        assertEquals(expected, Day02_2017.evendivion(test_input));
    }

    @Test
    public void test_CanSumTheResultOfTheEvenlyDividedPairs() {
        assertEquals(9, Day02_2017.divisionsum("5 9 2 8", "9 4 7 3", "3 8 6 5"));
    }
}

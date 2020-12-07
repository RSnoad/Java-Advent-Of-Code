import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Tests_Day01_2017 {

    @ParameterizedTest
    @CsvSource({"1122,3", "1234,0"})
    public void Part1SumIsCalculatedCorrectlyForNonCircularSequence(String input,int expected) {

        assertEquals(expected, Day01_2017.captcha(input));
    }

    @ParameterizedTest
    @CsvSource({"1111,4", "91212129,9"})
    public void Part1SumIsCalculatedCorrectlyForCircularSequence(String input, int expected) {
        assertEquals(expected, Day01_2017.captcha(input));
    }

    @ParameterizedTest
    @CsvSource({"1212,6", "1221,0", "123123,12", "12131415,4"})
    public void Part2SumIsCalculatedCorrectly(String input, int expected) {
        assertEquals(expected, Day01_2017.captchaHalfStep(input));
    }

    @Test
    public void Part2FinalSolutionIsCalculatedCorrectly() {
        assertEquals(1284, Day01_2017.findSolution());
    }
}

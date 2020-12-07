import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests_Day06_2017 {

    @Test
    public void canConvertInputStringToListOfIntegers() {
        List<Integer> expected = Arrays.asList(0, 2, 7, 0);
        assertEquals(expected, Day06_2017.convertToListOfDigits("0 2 7 0"));

    }


    // Would like to parametrize but having issues with parametrizing a list (CsvSource doesn't seem to support lists).
    @Test
    public void canRedistributeLargestBlock() {
        List<Integer> expected = Arrays.asList(2, 4, 1, 2);
        assertEquals(expected, Day06_2017.redistribute((Day06_2017.convertToListOfDigits("0 2 7 0"))));
    }

//    @Test
//    public void canRedistributeUntilRepetitionIsFound() {
//        assertEquals(5, Day06_2017.balanceblocks(Day06_2017.convertToListOfDigits("0 2 7 0")));
//    }

}

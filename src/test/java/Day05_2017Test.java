import Day05_2017.Day05_2017;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day05_2017Test {

    String puzzleInput;

    {
        try {
            puzzleInput = new String(Files.readAllBytes(Paths.get("/Users/snoadr/Documents/Java-Adevent-Of-Code/src/main/java/Day05_2017/Day05Input.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void canConvertStringToListOfDigits() {
        String testInput = "0\n3\n1";
        List<Integer> testList = new ArrayList<>(Arrays.asList(0, 3, 1));

        List<Integer> convertedList =  Day05_2017.convertInput(testInput);

        Assertions.assertEquals(testList,convertedList);
    }

    // Could possibly take smaller TDD steps for this problem, not sure how useful it would be in this instance.
    @Test
    public void canFindNumberOfJumpsForExampleInputPart1() {
        Assertions.assertEquals(5, Day05_2017.jumpsToEscape("0\n3\n0\n1\n-3"));
    }

    @Test
    public void canFindNumberOfJumpsForPuzzleInputPart1() {
        Assertions.assertEquals(343364, Day05_2017.jumpsToEscape(puzzleInput));
    }

    @Test
    public void canFindNumberOfJumpsForExampleInputPart2() {
        Assertions.assertEquals(10, Day05_2017.jumpsToEscapePart2("0\n3\n0\n1\n-3"));
    }

    @Test
    public void canFindNumberOfJumpsForPuzzleInputPart2() {
        Assertions.assertEquals(25071947, Day05_2017.jumpsToEscapePart2(puzzleInput));
    }



}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Day04_2017Test {
    Day04_Input puzzleInput = new Day04_Input();
    String testInput = """
            aa bb cc dd ee
            aa bb cc dd aa
            aa bb cc dd aaa
            """;

    String testInputPart2 = """
            abcde fghij
            abcde xyz ecdab
            a ab abc abd abf abj
            iiii oiii ooii oooi oooo
            oiii ioii iioi iiio
            """;

    @ParameterizedTest
    @CsvSource({"aa bb cc dd ee", "aa bb cc dd aaa"})
    public void canCheckAValidPassPhrase(String input) {
        Assertions.assertTrue(Day04_2017.passPhraseValidator(input));
    }

    @ParameterizedTest
    @CsvSource({"aa bb cc dd aa", "aa gg rr rr"})
    public void canCheckAnInvalidPassPhrase(String input) {
        Assertions.assertFalse(Day04_2017.passPhraseValidator(input));
    }

    @Test
    public void canCountValidPhrasesForShortInputPart1() {
        Assertions.assertEquals(2, Day04_2017.validPhrasesCount(testInput));
    }

    @Test
    public void canCountValidPhrasesForPuzzleInputPart1() {
        Assertions.assertEquals(455, Day04_2017.validPhrasesCount(puzzleInput.getInput()));
    }

    @ParameterizedTest
    @CsvSource({("edcba, abcde"), ("aayybbzztt, aabbttyyzz")})
    public void canSortStringInAlphabeticalOrder(String input, String expected) {
        Assertions.assertEquals(expected, Day04_2017.sortString(input));
    }

    @ParameterizedTest
    @CsvSource({("abcde, edcba"), ("qwerty, ywertq")})
    public void canIdentifyAnagram(String phrase1, String phrase2) {
        Assertions.assertTrue(Day04_2017.isAnagram(phrase1, phrase2));
    }

    @ParameterizedTest
    @CsvSource({("qwerty, abcde"), ("abcd, aabcd")})
    public void canIdentifyNonAnagram(String phrase1, String phrase2) {
        Assertions.assertFalse(Day04_2017.isAnagram(phrase1, phrase2));
    }

    @ParameterizedTest
    @CsvSource({("abcde fghij"), ("a ab abc abd abf abj"), ("iiii oiii ooii oooi oooo")})
    public void canCheckValidPassPhraseWithNoAnagramRequirement(String input) {
        Assertions.assertTrue(Day04_2017.anagramPhraseValidator(input));
    }

    @Test
    public void canCheckValidPhraseForShortInputPart2() {
        Assertions.assertEquals(3, Day04_2017.validPhraseCountAnagram(testInputPart2));
    }

    @Test
    public void canCheckValidPhraseForPuzzleInputPart2() {
        Assertions.assertEquals(186, Day04_2017.validPhraseCountAnagram(puzzleInput.getInput()));
    }


}

import java.util.Arrays;

public class Day04_2017 {
    public static void main(String[] args) {
        Day04_Input input = new Day04_Input();


        System.out.println(validPhrasesCount(input.getInput()));
        System.out.println(validPhraseCountAnagram(input.getInput()));
    }

    public static boolean passPhraseValidator(String phrase) {
        String[] phraseArray = phrase.split(" ");

        for (int i = 0; i < phraseArray.length; i++) {
            for (int j = i + 1; j < phraseArray.length; j++) {
                if (phraseArray[i].equals(phraseArray[j])) {
                    return false;
                }
            }
        }
        return true;
    }


    public static int validPhrasesCount(String phrases) {
        String[] phraseArray = phrases.split("\n");
        int count = 0;
        for (String s : phraseArray) {
            if (passPhraseValidator(s)) {
                count++;
            }

        }

        return count;
    }

    public static boolean isAnagram(String phrase1, String phrase2) {
        return sortString(phrase1).equals(sortString(phrase2));
    }

    public static String sortString(String string) {
        char[] array = string.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);

    }

    public static boolean anagramPhraseValidator(String phrase) {
        String[] phraseArray = phrase.split(" ");

        for (int i = 0; i < phraseArray.length; i++) {
            for (int j = i + 1; j < phraseArray.length; j++) {
                if (isAnagram(phraseArray[i], phraseArray[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // Essentially identical to the validPhraseCount() funciton above, not sure how to refactor as the difference is function called.
    public static int validPhraseCountAnagram(String phrases) {
        String[] phraseArray = phrases.split("\n");
        int count = 0;
        for (String s : phraseArray) {
            if (anagramPhraseValidator(s)) {
                count++;
            }

        }

        return count;
    }
}



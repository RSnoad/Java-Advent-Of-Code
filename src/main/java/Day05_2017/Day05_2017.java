package Day05_2017;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day05_2017 {
    public static void main(String[] args) throws IOException {

        String puzzleInput = new String(Files.readAllBytes(Paths.get("/Users/snoadr/Documents/Java-Adevent-Of-Code/src/main/java/Day05_2017/Day05Input.txt")));

        System.out.println("Part 1 answer: " + jumpsToEscape(puzzleInput));
        System.out.println("Part 2 answer: " + jumpsToEscapePart2(puzzleInput));
    }


    public static List<Integer> convertInput(String maze) {

        List<String> stringMaze = Arrays.asList(maze.split("\\n"));

        List<Integer> digitMaze = stringMaze
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


//// Loop might be better/ more efficient in this instance but want to play with streams. Try to discuss pros/ cons at some point.
//        List<Integer> digitMaze = new ArrayList<>();
//        for (String s : stringMaze) {
//            digitMaze.add(Integer.parseInt(s));
//
//        }
        return digitMaze;
    }


    // Still unsure if doing separating update and jump step and testing would be better or messier.
    // Would make refactoring easier.
    public static int jumpsToEscape(String inputMaze) {
        int numberOfSteps = 0;
        int index = 0;
        List<Integer> maze = convertInput(inputMaze);

        while (index < maze.size()) {
            int stepsToJump = maze.get(index);
            maze.set(index, maze.get(index) + 1);
            index = stepsToJump + index;
            numberOfSteps++;
        }

        return numberOfSteps;

    }

    // Think on how to merge these two functions and if it's reasonable to do so.
    public static int jumpsToEscapePart2(String inputMaze) {
        int numberOfSteps = 0;
        int index = 0;
        List<Integer> maze = convertInput(inputMaze);

        while (index < maze.size()) {
            int stepsToJump = maze.get(index);
            calcOffsetValue(index, maze);
            index = stepsToJump + index;
            numberOfSteps++;
        }

        return numberOfSteps;

    }

    static void calcOffsetValue(int index, List<Integer> maze) {
        if (maze.get(index) < 3) {
            maze.set(index, maze.get(index) + 1);
        } else {
            maze.set(index, maze.get(index) - 1);
        }
    }



}













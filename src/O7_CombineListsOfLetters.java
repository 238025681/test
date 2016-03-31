import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by chobi on 3/30/16.
 *
 * Write a program that reads two lists of letters l1 and l2 and combines them:
 * appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
 * Print the obtained combined list. All lists are given as sequence of letters separated by a single space,
 * each at a separate line. Use ArrayList<Character> of chars to keep the input and output lists
 */
public class O7_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input =scan.nextLine().replaceAll("\\s","");
        ArrayList<Character> firstLetters = new ArrayList<>();
        ArrayList<Character> secondLetters = new ArrayList<>();

        createCharArray(input, firstLetters);

        input =scan.nextLine().replaceAll("\\s","");
        createCharArray(input, secondLetters);

        ArrayList<Character> outputResult = new ArrayList<>(firstLetters);
        combineLists(firstLetters, secondLetters, outputResult);


        outputResult.forEach(item -> System.out.printf("%s ", item));
    }

    private static void combineLists(
            ArrayList<Character> firstLetters,
            ArrayList<Character> secondLetters,
            ArrayList<Character> outputResult) {

        for (int i = 0; i < secondLetters.size(); i++) {
            if (firstLetters.contains(secondLetters.get(i))){
                continue;
            }
            else {
                outputResult.add(secondLetters.get(i));
            }
        }
    }

    private static void createCharArray(String input, ArrayList<Character> firstLetters) {
        for (int i = 0; i < input.length(); i++) {
            firstLetters.add(input.charAt(i));
        }

    }
}

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by chobi on 3/28/16.
 *
 * Write a program that enters an array of strings
 * and finds in it the largest sequence of equal elements.
 * If several sequences have the same longest length,
 * print the leftmost of them. The input strings are given as a single line,
 * separated by a space.
 */
public class O3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        TreeMap<String, Integer> sequence = new TreeMap<>();
        int value = 0;
        for (String s: input) {

            if (sequence.containsKey(s)){
                value = sequence.get(s);
                value++;

                sequence.replace(s, sequence.get(s), value);
            }
            else {
                sequence.put(s, 1);
            }

        }
        String first = String.valueOf(sequence.firstEntry().getValue());

        int maxValue = Collections.max(sequence.values());

        sequence.entrySet().stream().filter((entry) -> entry.getValue() == maxValue ).forEach(entry -> {
            boolean firstEntry = false;
            if (!firstEntry){
                System.out.print(String.join(" ", Collections.nCopies(entry.getValue(), entry.getKey())));
                firstEntry = true;
            }
            else {
                // Do noting!! :)
            }

        });


    }


}


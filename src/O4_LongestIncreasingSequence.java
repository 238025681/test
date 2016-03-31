import java.util.*;

/**
 * Created by chobi on 3/29/16.
 *
 * Write a program to find all increasing sequences inside an array of integers.
 * The integers are given in a single line, separated by a space.
 * Print the sequences in the order of their appearance in the input array,
 * each at a single line. Separate the sequence elements by a space.
 * Find also the longest increasing sequence and print it at the last line.
 * If several sequences have the same longest length, print the leftmost of them.
 */
public class O4_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        Integer [] numbers = Arrays.stream(input).map(num -> Integer.parseInt(num)).toArray(Integer[]::new);
        HashMap<Integer, LinkedList<Integer>> allSequences = new HashMap<>();
        int counterSequence = 1;
        LinkedList<Integer> numInSequence = new LinkedList<>();
        numInSequence.add(numbers[0]);
        allSequences.put(counterSequence, numInSequence);

        // get all sequence
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numbers[i - 1]){
                numInSequence.add(numbers[i]);
                allSequences.put(counterSequence, numInSequence);
            }
            else {
                counterSequence++;
                numInSequence = new LinkedList<>();
                numInSequence.add(numbers[i]);
                allSequences.put(counterSequence, numInSequence);

            }
        }

        // Print all sequence and found Largest sequence

        int maxSequencesLength = 0;
        int maxSequences = 0;
        for (Map.Entry<Integer, LinkedList<Integer>> entry: allSequences.entrySet()) {
            if (entry.getValue().size() > maxSequencesLength){
                maxSequencesLength = entry.getValue().size();
                maxSequences = entry.getKey();
            }
            for (int list: entry.getValue()) {
                System.out.print(list + " ");
            }
            System.out.println();

        }

        //Print Largest sequence

        for (Map.Entry<Integer, LinkedList<Integer>> entry: allSequences.entrySet()) {

            for (int i = 0; i < allSequences.size(); i++) {
                if (entry.getKey() == maxSequences) {
                    System.out.print ("Longest : ");
                    for (int list : entry.getValue()) {
                        System.out.print( list + " ");
                    }
                    break;
                }

            }


        }
    }
}

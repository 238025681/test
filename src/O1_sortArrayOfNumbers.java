
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by chobi on 3/28/16.
 *
 * Write a program to enter a number n and n integer numbers
 * and sort and print them. Keep the numbers in array of integers: int[].
 */
public class O1_sortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int arrLength = Integer.parseInt(input);
        String [] inputArray = new String[arrLength]; // Излишен ред ама няма какво да я правя променливата arrLength
        inputArray = scan.nextLine().split(" ");
        Integer[] numbers = Arrays.stream(inputArray).map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        Arrays.sort(numbers);

        Arrays.stream(numbers).forEach(s -> System.out.println(s));
    }
}

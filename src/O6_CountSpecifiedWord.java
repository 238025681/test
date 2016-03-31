import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chobi on 3/30/16.
 *
 * Write a program to find how many times a word appears in given text.
 * The text is given at the first input line. The target word is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 * Consider that any non-letter character is a word separator.
 */
public class O6_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        String specWord = scan.nextLine().toLowerCase();

        Pattern patterns = Pattern.compile("[\\s\\W]*" + specWord +"[\\s\\W]*[^a-zA-z]");
        Matcher match = patterns.matcher(input);

        int count = 0;
        while (match.find()){

            count++;
        }
        System.out.println(count);
    }
}

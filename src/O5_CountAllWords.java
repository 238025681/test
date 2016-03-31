import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chobi on 3/30/16.
 * Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
 */
public class O5_CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern patter = Pattern.compile("[a-zA-Z0-9]+");
        Matcher match = patter.matcher(input);
        int count = 0;
        while (match.find()){
            count++;
        }
        System.out.println(count);
    }
}

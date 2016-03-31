import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chobi on 3/30/16.
 */
public class O8_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        Pattern regex = Pattern.compile("[a-zA-Z0-9]+");
        Matcher match = regex.matcher(input);
        TreeSet<String> wordList = new TreeSet<>();
        while (match.find()){
            wordList.add(match.group());
        }

        wordList.forEach(s -> {
            System.out.printf("%s ", s);
        });
    }
}

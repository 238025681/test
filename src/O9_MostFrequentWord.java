import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chobi on 3/30/16.
 *
 * At the first line at the console you are given a piece of text.
 * Extract all words from it and print them in alphabetical order.
 * Consider each non-letter character as word separator.
 * Take the repeating words only once. Ignore the character casing.
 * Print the result words in a single line, separated by spaces
 */
public class O9_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        Pattern regex = Pattern.compile("[a-zA-Z0-9]+");
        Matcher match = regex.matcher(input);
        ArrayList<String> wordList = new ArrayList<>();
        while (match.find()){
            wordList.add(match.group());
        }
        TreeMap<String, Integer> result = new TreeMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            if (result.containsKey(wordList.get(i))){
                result.put(wordList.get(i), result.get(wordList.get(i))+1 );
            }
            else{
                result.put(wordList.get(i),1);
            }
        }
        int maxRes = Collections.max(result.values());

        result.entrySet().stream().filter((entry) -> entry.getValue() == maxRes ).forEach(entry -> {
            System.out.printf("%s -> %s times",entry.getKey(), entry.getValue());
            System.out.println();
        });

    }
}

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chobi on 3/30/16.
 *
 * We are given a sequence of N playing cards from a standard deck.
 * The input consists of several cards (face + suit), separated by a space.
 * Write a program to calculate and print at the console the frequency of each card face in format "card_face -> frequency".
 * The frequency is calculated by the formula appearances / N
 * and is expressed in percentages with exactly 2 digits after the decimal point.
 * The card faces with their frequency should be printed in the order of the card face's first appearance in the input.
 * The same card can appear multiple times in the input, but it's face should be listed only once in the output.
 */
public class IO_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern regex = Pattern.compile("[a-zA-Z0-9]+");
        Matcher match = regex.matcher(input);
        ArrayList<String> wordList = new ArrayList<>();
        while (match.find()){
            wordList.add(match.group());
        }
        //System.out.println(wordList);
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < wordList.size(); i++) {
            if (result.containsKey(wordList.get(i))){
                result.put(wordList.get(i), result.get(wordList.get(i))+1 );
            }
            else{
                result.put(wordList.get(i),1);
            }
        }
        result.entrySet().stream().forEach(entry -> {
            System.out.printf("%s -> %.2f%%",entry.getKey(), ( (double)entry.getValue() / (double)wordList.size()) * 100 );
            System.out.println();
        });
    }
}

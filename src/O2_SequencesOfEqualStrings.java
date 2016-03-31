import java.util.Scanner;

/**
 * Created by chobi on 3/28/16.
 * Write a program that enters an array of strings
 * and finds in it all sequences of equal elements.
 * The input strings are given as a single line, separated by a space.
 */
public class O2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] inputArr = scan.nextLine().split(" ");
        for (int i = 0 ; i < inputArr.length; i++){
            if (i==0){
                System.out.printf("%s ",inputArr[i]);
            }
            else if (inputArr[i].equals(inputArr[i-1])){
                System.out.printf("%s ",inputArr[i]);
            }
            else {
                System.out.println();
                System.out.printf("%s ",inputArr[i]);
            }
        }
    }
}

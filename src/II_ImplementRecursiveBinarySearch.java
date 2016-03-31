import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chobi on 3/30/16.
 *
 * Binary search is an algorithm that works on already sorted arrays.
 * Basically, it goes to the middle element and checks it has to continue searching to the left,
 * or to the right. Return the index of the element, or -1, if the element is not found.
 */
public class II_ImplementRecursiveBinarySearch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int searchNum = Integer.parseInt(input);
        input = scan.nextLine();
        String [] arr = input.split(" ");
        Arrays.sort(arr);
        int [] numbers = new int[arr.length];
        int i=0;
        for (String s: arr) {
            numbers[i] = Integer.parseInt(s);
            i++;
        }
        searchBynary(numbers, searchNum);
    }

    private static void searchBynary(int[] numbers, int searchNum) {
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;
        while (high >= low){
            int middle = (low + high) / 2;
            if(numbers[middle] == searchNum){
                System.out.println(middle);
                found = true;
                break;
            } else if (numbers[middle] < searchNum){
                low = middle + 1;
            }else if (numbers[middle] > searchNum){
                high = middle - 1;
            }

        }
        if (!found){
            System.out.println(-1);
        }
    }

}

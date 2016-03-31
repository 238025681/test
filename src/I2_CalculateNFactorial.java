import java.util.Scanner;

/**
 * Created by chobi on 3/30/16.
 *
 * Write a program that recursively calculates factorial.
 */
public class I2_CalculateNFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(nFactorial(number));
        
    }

    private static int nFactorial(int number) {
        int result;
        if(number == 0 || number==1) {
            return 1;
        }

        result = nFactorial(number-1) * number;
        return result;
    }
}

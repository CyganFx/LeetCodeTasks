import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Starting with any positive integer, replace the number by the sum of squares of its digits, and
 * repeat the process until the number equals 1 in the end (happy number). Beware of infinite loops.
 */

public class HappyNumber {

    public static int sumOfSquaresOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;
            sum += Math.pow(lastDigit, 2);
        }
        return sum;
    }

    public static boolean isHappyNumber(int number) {
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            if (number == 1) {
                return true;
            }
            number = sumOfSquaresOfNumberDigits(number);
            if (visited.contains(number)) {
                return false;
            }
            visited.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(in);
        number = scan.nextInt();
        out.println(isHappyNumber(number));
    }
}

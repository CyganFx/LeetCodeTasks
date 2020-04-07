import static java.lang.System.*;
/**
 * Algorithm that finds single number in array that all other
 * elements have duplicates. O(n) time O(1) space
 * Solution: XOR bitwise operator
 */
public class SingleNumber {

    public static int findSingleNumber(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number ^= arr[i];
        }
        return number;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 2};
        out.println(findSingleNumber(arr)); // 1
    }
}

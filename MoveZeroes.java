public class MoveZeroes {
    /**
     * Algorithm that moves zeroes to the end of array while
     * remaining original order of array. O(n) time, O(1) space.
     */
    public static int[] moveZeroes(int[] arr) {
        int nonZeroCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroCounter] = arr[i];
                nonZeroCounter++;
            }
        }
        for (int i = nonZeroCounter; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // [1, 3, 12, 0, 0]
        }
    }
}

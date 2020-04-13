public class DuplicateNumber {
    /**
     * Given an array containing n + 1 integers where each integer is
     * between 1 and n. Find the duplicate number.
     * Solution: Floyd's turtle and hare algorithm - O(N) time, 0(1) space
     */
    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[arr[0]];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3, 6, 3};
        System.out.println(findDuplicate(arr));
    }
}

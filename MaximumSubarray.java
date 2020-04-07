import static java.lang.System.*;

/**
 * Kadane's algorithms that finds the maximum sum of contiguous subarray
 */

public class MaximumSubarray {

    public static int findMaxSubarraySum(int[] arr) {
        int currentMax, globalMax;
        currentMax = globalMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 6, -1};
        out.println(findMaxSubarraySum(arr)); // 7
    }
}

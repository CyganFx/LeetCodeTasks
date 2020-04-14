package com.company;
/**
 * Kadane's algorithms that finds the maximum sum of contiguous subArray
 */
public class MaxSubArray {

    public static int findMaxSubArraySum(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], arr[i] + currentMax);
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 6, -1};
        System.out.println(findMaxSubArraySum(arr)); // 7
    }
}

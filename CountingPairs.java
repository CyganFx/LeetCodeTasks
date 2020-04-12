import java.util.Arrays;
/**
 * A sorting base program to count distinct pairs
 * in sorted array with given difference
 */
class CountingPairs {

    static int binarySearch(int arr[], int lowIndex, int highIndex, int secondPair) {
        if (highIndex >= lowIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (secondPair == arr[midIndex]) {
                return midIndex;
            }
            if (secondPair > arr[midIndex]) {
                return binarySearch(arr, (midIndex + 1), highIndex, secondPair);
            } else {
                return binarySearch(arr, lowIndex, (midIndex - 1), secondPair);
            }
        }
        return -1;
    }

    static int countPairsWithDifference(int arr[], int difference) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (binarySearch(arr, i + 1,
                    arr.length - 1, arr[i] + difference) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 2, 8};
        int difference = 3;
        System.out.println(countPairsWithDifference(arr, difference));
    }
} 
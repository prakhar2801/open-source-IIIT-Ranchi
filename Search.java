public class BinarySearch {
    // Recursive implementation of binary search
    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            // If the target is present at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is smaller than the middle element
            if (arr[mid] > target) {
                return binarySearchRecursive(arr, low, mid - 1, target);
            }

            // If the target is larger than the middle element
            return binarySearchRecursive(arr, mid + 1, high, target);
        }

        // If the target is not present in the array
        return -1;
    }

    // Iterative implementation of binary search
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If the target is present at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is smaller than the middle element
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                // If the target is larger than the middle element
                low = mid + 1;
            }
        }

        // If the target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        int resultRecursive = binarySearchRecursive(sortedArray, 0, sortedArray.length - 1, target);
        int resultIterative = binarySearchIterative(sortedArray, target);

        System.out.println("Recursive Binary Search:");
        if (resultRecursive != -1) {
            System.out.println("Element found at index: " + resultRecursive);
        } else {
            System.out.println("Element not found in the array.");
        }

        System.out.println("Iterative Binary Search:");
        if (resultIterative != -1) {
            System.out.println("Element found at index: " + resultIterative);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

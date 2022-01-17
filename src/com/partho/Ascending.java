package com.partho;

public class Ascending {
    public static void main(String[] args) {
        int[] arr = {-5, -1, 0, 4, 6, 9, 12, 15, 21, 23, 28, 31};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println("Target element index is : " + ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

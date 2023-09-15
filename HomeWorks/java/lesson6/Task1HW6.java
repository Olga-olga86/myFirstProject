package lesson6;

import java.util.Arrays;

public class Task1HW6 {

    public static void main(String[] args) {
        int[] numbers = {5, 11, 7, 20};
        int result = smallestDifference(numbers);
        System.out.println("The smallest difference is: " + result);
    }

    public static int smallestDifference(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }
}







 import java.util.*;

public class day16 {

    // Q61 Find Missing Number in Array
    static void findMissingNumber() {
        int arr[] = {1, 2, 3, 5};
        int n = 5;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Missing Number: " + (total - sum));
    }

    // Q62 Find Maximum Frequency Element
    static void maxFrequencyElement() {
        int arr[] = {1, 2, 2, 3, 3, 3, 4};

        int maxCount = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element: " + maxElement);
    }

    // Q63 Find Pair With Given Sum
    static void pairWithGivenSum() {
        int arr[] = {1, 4, 5, 6, 8, 9};
        int target = 10;

        System.out.println("Pairs with sum " + target + ":");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    // Q64 Remove Duplicates from Array
    static void removeDuplicates() {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findMissingNumber();
        maxFrequencyElement();
        pairWithGivenSum();
        removeDuplicates();
    }
}


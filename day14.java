import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q53 Linear Search
        System.out.println("Q53 Linear Search");
        int[] arr1 = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        // Q54 Frequency of an Element
        System.out.println("\nQ54 Frequency of an Element");
        int[] arr2 = {1, 2, 3, 2, 4, 2, 5};
        int element = 2;
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == element) {
                count++;
            }
        }

        System.out.println("Frequency of " + element + " = " + count);

        // Q55 Second Largest Element
        System.out.println("\nQ55 Second Largest Element");
        int[] arr3 = {12, 35, 1, 10, 34, 35};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr3) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element = " + secondLargest);

        // Q56 Find Duplicates in Array
        System.out.println("\nQ56 Find Duplicates in Array");
        int[] arr4 = {1, 2, 3, 2, 4, 5, 1, 6};

        System.out.print("Duplicate Elements: ");
        for (int i = 0; i < arr4.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr4[i] == arr4[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                continue;
            }

            for (int j = i + 1; j < arr4.length; j++) {
                if (arr4[i] == arr4[j]) {
                    System.out.print(arr4[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}

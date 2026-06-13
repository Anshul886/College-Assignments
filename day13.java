import java.util.Scanner;

public class day13 {
    static void displayArray(int arr[]) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sumAndAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

    static void largestAndSmallest(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
        System.out.println("Smallest Element = " + smallest);
    }

    static void countEvenOdd(int arr[]) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Elements = " + even);
        System.out.println("Odd Elements = " + odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        displayArray(arr);          // Q49
        sumAndAverage(arr);         // Q50
        largestAndSmallest(arr);    // Q51
        countEvenOdd(arr);          // Q52

        sc.close();
    }
}

    


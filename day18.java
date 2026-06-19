d import java.util.*;

public class day18 {

    // Q69 Bubble Sort
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr));
    }

    // Q70 Selection Sort
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sort:");
        System.out.println(Arrays.toString(arr));
    }

    // Q71 Binary Search
    static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Q72 Sort Array in Descending Order
    static void descendingSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending Order Sort:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr1[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr1);

        int arr2[] = {29, 10, 14, 37, 13};
        selectionSort(arr2);

        int arr3[] = {10, 20, 30, 40, 50, 60};
        int key = 40;
        int result = binarySearch(arr3, key);

        if (result != -1)
            System.out.println("Binary Search: Element found at index " + result);
        else
            System.out.println("Binary Search: Element not found");

        int arr4[] = {5, 2, 8, 1, 9, 3};
        descendingSort(arr4);
    }
}

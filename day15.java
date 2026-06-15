import java.util.*;

public class day15 {

    // Q57 Reverse Array
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Q58 Rotate Array Left
    static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        System.out.println("Left Rotated Array: " + Arrays.toString(temp));
    }

    // Q59 Rotate Array Right
    static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + d) % n] = arr[i];
        }

        System.out.println("Right Rotated Array: " + Arrays.toString(temp));
    }

    // Q60 Move Zeroes to End
    static void moveZeroesToEnd(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Zeroes Moved to End: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArray(arr1);

        int[] arr2 = {1, 2, 3, 4, 5};
        rotateLeft(arr2, 2);

        int[] arr3 = {1, 2, 3, 4, 5};
        rotateRight(arr3, 2);

        int[] arr4 = {1, 0, 2, 0, 3, 0, 4, 5};
        moveZeroesToEnd(arr4);
    }
}

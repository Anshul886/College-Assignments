import java.util.*;

public class day17 {

    // Q65 Merge Arrays
    static void mergeArrays(int[] a, int[] b) {
        int[] merge = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }

        System.out.println("Merged Array:");
        System.out.println(Arrays.toString(merge));
    }

    // Q66 Union of Arrays
    static void unionArrays(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a)
            set.add(num);

        for (int num : b)
            set.add(num);

        System.out.println("Union of Arrays:");
        System.out.println(set);
    }

    // Q67 Intersection of Arrays
    static void intersectionArrays(int[] a, int[] b) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : a)
            set1.add(num);

        for (int num : b) {
            if (set1.contains(num))
                intersection.add(num);
        }

        System.out.println("Intersection of Arrays:");
        System.out.println(intersection);
    }

    // Q68 Find Common Elements
    static void commonElements(int[] a, int[] b) {
        System.out.println("Common Elements:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        mergeArrays(arr1, arr2);
        unionArrays(arr1, arr2);
        intersectionArrays(arr1, arr2);
        commonElements(arr1, arr2);
    }
}

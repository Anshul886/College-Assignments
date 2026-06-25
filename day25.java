import java.util.*;

public class day25 {

    // Q98: Merge Two Sorted Arrays
    static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Q99: Find Common Characters in Strings
    static void commonCharacters(String s1, String s2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> common = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            set1.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (set1.contains(ch)) {
                common.add(ch);
            }
        }

        System.out.println("Common Characters: " + common);
    }

    // Q100: Sort Names Alphabetically
    static void sortNames(String[] names) {
        Arrays.sort(names);
        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Q101: Sort Words by Length
    static void sortWordsByLength(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println("Words Sorted by Length:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {

        // Q98
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        mergeSortedArrays(arr1, arr2);

        // Q99
        commonCharacters("programming", "gaming");

        // Q100
        String[] names = {"Anshul", "Ravi", "Amit", "Neha"};
        sortNames(names);

        // Q101
        String[] words = {"Java", "Programming", "Code", "AI", "Developer"};
        sortWordsByLength(words);
    }
}
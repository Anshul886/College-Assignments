import java.util.*;

public class day23 {

    // Q89 Find first non-repeating character
    static void firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeating Character: " + ch);
                return;
            }
        }
        System.out.println("No Non-Repeating Character Found");
    }

    // Q90 Find first repeating character
    static void firstRepeating(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("First Repeating Character: " + ch);
                return;
            }
            set.add(ch);
        }
        System.out.println("No Repeating Character Found");
    }

    // Q91 Check anagram strings
    static void checkAnagram(String str1, String str2) {
        char[] a = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are Not Anagrams");
    }

    // Q92 Find maximum occurring character
    static void maxOccurringChar(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                ch = str.charAt(i);
            }
        }

        System.out.println("Maximum Occurring Character: " + ch);
    }

    public static void main(String[] args) {

        String str1 = "programming";
        firstNonRepeating(str1);

        String str2 = "programming";
        firstRepeating(str2);

        String a = "listen";
        String b = "silent";
        checkAnagram(a, b);

        String str3 = "success";
        maxOccurringChar(str3);
    }
}
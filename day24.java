import java.util.*;

public class day24 {

    // Q94 - Check String Rotation
    static boolean isRotation(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    // Q95 - Compress a String
    static String compressString(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return result.toString();
    }

    // Q96 - Find Longest Word
    static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Q97 - Remove Duplicate Characters
    static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        // Q94
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println("String Rotation: " + isRotation(s1, s2));

        // Q95
        String str1 = "aaabbcccc";
        System.out.println("Compressed String: " + compressString(str1));

        // Q96
        String sentence = "Java is a powerful programming language";
        System.out.println("Longest Word: " + longestWord(sentence));

        // Q97
        String str2 = "programming";
        System.out.println("After Removing Duplicates: " + removeDuplicates(str2));
    }
}
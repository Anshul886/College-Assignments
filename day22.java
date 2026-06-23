import java.util.*;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q85 Check Palindrome String
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

        // Q86 Count Words in a Sentence
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count = " + words.length);

        // Q87 Character Frequency
        System.out.println("Enter a string for frequency count:");
        String freqStr = sc.nextLine();
        for (int i = 0; i < freqStr.length(); i++) {
            char ch = freqStr.charAt(i);
            int count = 1;

            if (ch == '0')
                continue;

            for (int j = i + 1; j < freqStr.length(); j++) {
                if (ch == freqStr.charAt(j)) {
                    count++;
                    freqStr = freqStr.substring(0, j) + '0' + freqStr.substring(j + 1);
                }
            }
            System.out.println(ch + " = " + count);
        }

        // Q88 Remove Spaces from String
        System.out.println("Enter a string with spaces:");
        String spaceStr = sc.nextLine();
        String result = spaceStr.replace(" ", "");
        System.out.println("String without spaces: " + result);

        sc.close();
    }
}
import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q81 Find String Length Without length()
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        System.out.println("Length of String = " + count);

        // Q82 Reverse a String
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String = " + reverse);

        // Q83 Count Vowels and Consonants
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        // Q84 Convert Lowercase to Uppercase
        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                upper += (char)(ch - 32);
            else
                upper += ch;
        }

        System.out.println("Uppercase String = " + upper);

        sc.close();
    }
}
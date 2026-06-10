public class day10 {
    public static void main(String[] args) {

        // Q37 - Star Pyramid
        System.out.println("Star Pyramid:");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        // Q38 - Reverse Star Pyramid
        System.out.println("\nReverse Pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        // Q39 - Number Pyramid
        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);
            System.out.println();
        }

        // Q40 - Character Pyramid
        System.out.println("\nCharacter Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch);
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--)
                System.out.print(ch);
            System.out.println();
        }
    }
}

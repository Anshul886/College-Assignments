public class day9 {
    public static void main(String[] args) {
        System.out.println("Reverse Star Pattern:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nReverse Number Triangle:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }

        System.out.println("\nRepeated Character Pattern:");
        for (int i = 1; i <= 5; i++) {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) System.out.print(ch);
            System.out.println();
        }

        System.out.println("\nHollow Square Pattern:");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

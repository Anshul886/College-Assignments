import java.util.Scanner;

public class sum_firstn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        if (!sc.hasNextLong()) {
            System.out.println("Invalid input");
            return;
        }
        long n = sc.nextLong();
        if (n < 0) {
            System.out.println("n must be non-negative");
            return;
        }
        long sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

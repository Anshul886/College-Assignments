import java.util.*;

public class day7 {

    // Q25 Recursive Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Q26 Recursive Fibonacci
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Q27 Recursive Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Q28 Recursive Reverse Number
    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q25
        System.out.print("Enter number for factorial: ");
        int n1 = sc.nextInt();
        System.out.println("Factorial = " + factorial(n1));

        // Q26
        System.out.print("Enter term for Fibonacci: ");
        int n2 = sc.nextInt();
        System.out.println("Fibonacci = " + fibonacci(n2));

        // Q27
        System.out.print("Enter number for sum of digits: ");
        int n3 = sc.nextInt();
        System.out.println("Sum of Digits = " + sumOfDigits(n3));

        // Q28
        System.out.print("Enter number to reverse: ");
        int n4 = sc.nextInt();
        System.out.println("Reverse Number = " + reverse(n4, 0));

        sc.close();
    }
}
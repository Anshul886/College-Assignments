import java.util.Scanner;

public class day11 {

    // Q41: Function to find sum of two numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // Q42: Function to find maximum of two numbers
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Q43: Function to check prime number
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Q44: Function to find factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + sum(a, b));
        System.out.println("Maximum = " + maximum(a, b));

        System.out.print("Enter number to check prime: ");
        int p = sc.nextInt();
        if (isPrime(p)) {
            System.out.println(p + " is Prime");
        } else {
            System.out.println(p + " is Not Prime");
        }

        System.out.print("Enter number to find factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}

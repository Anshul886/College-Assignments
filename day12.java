import java.util.Scanner;

public class day12 {

    static boolean isPalindrome(int num) {
        int original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return original == rev;
    }

    static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == original;
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for Palindrome: ");
        int p = sc.nextInt();
        System.out.println(isPalindrome(p) ? "Palindrome" : "Not Palindrome");

        System.out.print("Enter a number for Armstrong: ");
        int a = sc.nextInt();
        System.out.println(isArmstrong(a) ? "Armstrong Number" : "Not Armstrong Number");

        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();
        fibonacci(n);

        System.out.print("Enter a number for Perfect Number: ");
        int pn = sc.nextInt();
        System.out.println(isPerfect(pn) ? "Perfect Number" : "Not Perfect Number");

        sc.close();
    }
}
import java.util.Scanner;

public class day3 {

    // Q9 Check Prime Number
    static void checkPrime(int num) {
        int count = 0;

        if (num <= 1) {
            System.out.println(num + " is not a Prime Number");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else 
            System.out.println(num + " is not a Prime Number");
        }
    }

    // Q10 Print Prime Numbers in Range
    static void printPrimeRange(int start, int end) {

        System.out.println("Prime Numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {

            int count = 0;

            if (num <= 1) {
                continue;
            }

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

    // Q11 Find GCD
    static void findGCD(int a, int b) {

        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }

    // Q12 Find LCM
    static void findLCM(int a, int b) {

        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }

    
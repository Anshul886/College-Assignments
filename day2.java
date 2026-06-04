import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int product = 1;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;

            sum = sum + digit;
            product = product * digit;
            reverse = reverse * 10 + digit;

            temp = temp / 10;
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);
        System.out.println("Reverse number = " + reverse);

        if (num == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}


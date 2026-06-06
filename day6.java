import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String binary = "";
        if (n == 0) binary = "0";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        System.out.println("Binary = " + binary);
    }
}

class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        long binary = sc.nextLong();
        int decimal = 0, power = 0;
        while (binary > 0) {
            int digit = (int)(binary % 10);
            decimal += digit * (1 << power);
            power++;
            binary /= 10;
        }
        System.out.println("Decimal = " + decimal);
    }
}

class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println("Set Bits = " + count);
    }
}

class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Result = " + result);
    }
}


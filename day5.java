// Q17. Check Perfect Number
public class day5 {

    // Q17 Check Perfect Number
    static void perfectNumber() {
        int n = 28, sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println(sum == n ? "Perfect Number" : "Not Perfect Number");
    }

    // Q18 Check Strong Number
    static void strongNumber() {
        int n = 145, temp = n, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }
        System.out.println(sum == n ? "Strong Number" : "Not Strong Number");
    }

    // Q19 Print Factors of a Number
    static void factors() {
        int n = 24;
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // Q20 Find Largest Prime Factor
    static void largestPrimeFactor() {
        int n = 84, largest = -1;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
    }

    public static void main(String[] args) {
        perfectNumber();
        strongNumber();
        factors();
        largestPrimeFactor();
    }
}

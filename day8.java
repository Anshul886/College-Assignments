public class day8 {
    public static void main(String[] args) {

        // Q29: Half Pyramid Pattern
        System.out.println("Half Pyramid Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Q30: Number Triangle
        System.out.println("\nNumber Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Q31: Character Triangle
        System.out.println("\nCharacter Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        // Q32: Repeated Number Pattern
        System.out.println("\nRepeated Number Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

